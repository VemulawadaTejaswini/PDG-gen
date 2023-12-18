import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        int X =sc.nextInt();
        int Y =sc.nextInt();
        int S;
        if(N >= K){
            S = K*X+(N-K)*Y;
            System.out.println(M);
        }else{
            S=N*X;
            System.out.println(M);
        }
    }
}