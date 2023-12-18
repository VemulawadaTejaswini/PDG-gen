import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      double result;
      if (N==1)
      {
        result=N/1;
        System.out.printf("%.10f",result);
      }
      else
      {        
        result=(N+1)/2;
        System.out.printf("%.10f",result/N);
      }
	}
}