import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        //int K = sc.nextInt();
        long N = sc.nextLong();

        long res=0;

        for(int i=1; i<N; i++){
            res = res+ (N-1)/i;
        }
        
        System.out.println(res);
        }
    }