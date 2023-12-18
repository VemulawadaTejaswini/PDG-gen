import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int [] t = new int[N+11];
        int [] x = new int[N+1];
        int [] y = new int[N+1];
        t[0] =x[0] =y[0] =0;
        for (int i=1;i<=N;i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean flag =true;
        for (int i=0;i<N;i++){
            int dt = t[i+1] - t[i];
            int dist =Math.abs(x[i+1]-x[i]) + Math.abs(y[i+1] -y[i]);
            if (dist>dt){
                flag =false;
                break;
            }else{
                if (dist%2 != dt%2){
                    flag =false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}