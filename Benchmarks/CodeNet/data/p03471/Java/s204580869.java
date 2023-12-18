import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int Y = sc.nextInt();
        int a10000 = -1;
        int a5000  = -1;
        int a1000  = -1;
      
	    for(int i=0; i<=N; i++){
          for(int j=0; j<=N; j++){
            int c = N-i-j;
            if(10000*i+5000*j+c == Y){
              a10000 = i;
              a5000  = j;
              a1000  = c;
            }
          }
        }
		System.out.println(a10000+" "+a5000+" "+a1000);
    }
}
