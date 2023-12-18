import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt =0;
        if(N == 1){
          if(M == 1)
            cnt = 1;
          else
            cnt = M-2;
        }
        else if(N == 2)
          cnt = 0;
        else if(N > 2){
          if(M == 1)
            cnt = N-2;
          else
            cnt = (N-2)*(M-2);
        }
        System.out.println(cnt);  
	}
}