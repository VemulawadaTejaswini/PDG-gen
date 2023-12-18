import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //int Nall = pow(fac(N));
        //int[][] matrixArray = new int[4][Nall];
        int alpha=0;
        int sum =0;

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    //System.out.println(k);
                    alpha=gcd(i,j);
                    sum += gcd(alpha,k);
                }
            }
        }
        System.out.println(sum);
    }
    public static int fac(int N){
        if(N == 1){
            return 1;
        }else{
            return fac(N -1)*N;
        }
    }
    public static int pow(int N){
        return N*N*N;
    }
    public static int gcd(int a,int b){
        int c = a%b;
        if(c == 0){
            return b;
        }else{
            return gcd(b,c);
        }
    }
}