import java.util.*;
import java.lang.*;

class Engine{
    double x, y;
    public Engine(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double arg(){
        return Math.atan2(y,x);
    }


    static double totalMove(Engine[] engines, int L, int R){
        double totalX=0, totalY=0;
        for(int i=L; i<R; i++){
            totalX += engines[i].x;
            totalY += engines[i].y;
        }
        return Math.hypot(totalX, totalY);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Engine[] engines = new Engine[N];
        for(int n=0; n<N; n++) engines[n]=new Engine(sc.nextDouble(), sc.nextDouble());
        Arrays.sort(engines, Comparator.comparingDouble(Engine::arg));
        Engine[] doubleEngines = new Engine[N*2];
        for(int n=0; n<N; n++){
            doubleEngines[n] = engines[n];
            doubleEngines[n+N] = engines[n];
        }
        double ans = 0;
        for(int L=0; L<N; L++) for(int R=L+1; R<=N; R++){
            ans = Math.max(ans, Engine.totalMove(doubleEngines, L, R));
        }
        System.out.println(ans);
    }
}
