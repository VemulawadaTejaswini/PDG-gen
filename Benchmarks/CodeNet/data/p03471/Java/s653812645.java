import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int Y = sc.nextInt();
        Y /= 1000;
        int a10000 = -1;
        int a5000  = -1;
        int a1000  = -1;
        int flag   = 0;
      
	    for(int i=0; i<=N; i++){
          for(int j=0; j<=N; j++){
            int c = N-i-j;
            int M = 10*i + 5*j + c;
            if(M == Y){
              a10000 = i;
              a5000  = j;
              a1000  = c;
              flag   = 1;
              break;
            }
            if(flag == 1){
              break;
            }
          }
        }
		System.out.println(a10000+" "+a5000+" "+a1000);
    }
}
