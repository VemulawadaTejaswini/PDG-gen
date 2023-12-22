import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();
        int max = f(1,A,B);
        for(int i = 2; i <= N; i++){
            int t = f(i,A,B);
            if(t>max){
                max = t;
            }
        }
        System.out.print(max);
    }
    public static int f(int x,int A, int B){
        return (int)(Math.floor((double)x*A/(double) B)-A*Math.floor((double)x/(double) B));
    }

}