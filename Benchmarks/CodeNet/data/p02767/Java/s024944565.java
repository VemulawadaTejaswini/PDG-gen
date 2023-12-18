import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] X = new int[N];
        int[] sq = new int[N];

        for(int i=0;i<N;i++){
            X[i] = 0;
            sq[i] = 0;
        }

        for(int i=0;i<N;i++){
            X[i] = scan.nextInt();
            sq[i] = X[i]*X[i];
        }

        double a = (double)Sum(X,N)/N - Sum(X,N)/N;


        System.out.println(Sum(X,N)%N==0?Sum(sq,N)-Sum(X,N)*Sum(X,N)/N:Sum(sq,N)-Sum(X,N)*Sum(X,N)/N+(int)min(a,1-a));


        scan.close();
    }

    public static int Sum(int[] x,int N){
        int sum = 0;
        for(int i=0;i<N;i++){
            sum += x[i];
        }

        return sum;
    }

    public static double min(double x,double y){
        if(x>=y) return y;

        return x;
    }

}
