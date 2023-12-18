import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int Y = sc.nextInt();
        int a = -1;
        int b = -1;
        int c = -1;
        int flag = 0;
      
	    for(int i=0; i<=N; i++){
          for(int j=0; i+j<=N; j++){
            int k = N-i-j;
            int M = 10000*i + 5000*j + 1000*k;
            if(M == Y){
              a = i;
              b = j;
              c = k;
              flag = 1;
              break;
            }
            if(flag == 1){
              break;
            }
          }
        }
		System.out.println(a+" "+b+" "+c);
    }
}
