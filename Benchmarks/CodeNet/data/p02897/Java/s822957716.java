import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int count = oddCount(N);
        double result = (double)count/N;
      
      	System.out.println(result);
	}
  
  	public static int oddCount(int N){
      ArrayList<Integer> intList = new ArrayList<Integer>();
      for(int i = 1; i<=N; i++){
      	intList.add(i);
      }
      int count = 0;
      for(int aN : intList){
        if (aN%2==1){
          count++;
        }
      }
      System.out.println(count);
      return count;
      
    }
}