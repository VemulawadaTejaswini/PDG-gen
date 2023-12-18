import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
      	int nam[] = new int[a];
      	int nam2[] = new int[a-1];
      
      for(int i = 0;i < a-1;i++){
      nam2[i] = in.nextInt();
      }
      
      nam[0] = nam2[0];
      nam[a-1] = nam2[a-2];
      long sum = 0;
      
      for(int i = 1;i < a-1;i++){
      	nam[i] = Math.min(nam2[i],nam2[i-1]);
      }
      for(int i = 0;i < a;i++){
      sum += nam[i];
      }
      System.out.print(sum);
      
	}
}