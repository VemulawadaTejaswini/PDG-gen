import java.util.*;

public class Main{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      double a[] = new double[count];
      double sum = 0;
      for(int i = 0; i < count; i++){
        a[i] = sc.nextInt();
        sum += 1/a[i];
      }
      System.out.println(1/sum);
	}
}