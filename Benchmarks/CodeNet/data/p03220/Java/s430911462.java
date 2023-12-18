import java.util.*;

public class Main {
    public static void main(String[] args) {
        int place;
        double tSurf, tA;
        Scanner sc = new Scanner(System.in);
        place = sc.nextInt();
        tSurf = sc.nextDouble();
        tA = sc.nextDouble();
        double[] ts = new double[place];
        
        int result = 1;
        for(int i = 0; i < place; i++){
            ts[i] = tSurf - sc.nextInt() * 0.006;
            if(i == 0) continue;
            if(Math.abs(tA - ts[i]) <= Math.abs(tA - ts[i-1])){
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}
