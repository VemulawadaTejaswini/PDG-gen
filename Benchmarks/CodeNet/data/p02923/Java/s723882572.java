import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
      	long nam[] = new long[N];
      	long memo = 0;
      	long cnt = 0;
      
      nam[0] = in.nextLong();
      
      for(int i = 1;i < N;i++){
       	nam[i] = in.nextLong();
        
       	if(nam[i-1]>=nam[i]){cnt++;}
        else{cnt = 0;}
        memo = Math.max(cnt,memo);
      }
     System.out.print(memo);
	}
}