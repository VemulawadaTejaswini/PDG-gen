import java.util.*;

public class Main{
   public static void main(String args[])
   {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long T = in.nextLong();
		long min = 0;
		long sum = 0; 
		long i = 0;

		for(int cnt = 0; cnt < N; cnt++){
			i = in.nextLong();
			sum = sum + i;
			if(T < i){
					min = min + (i - T);
				}
			
			}

		System.out.println(sum - min + T);

		
   }
}
