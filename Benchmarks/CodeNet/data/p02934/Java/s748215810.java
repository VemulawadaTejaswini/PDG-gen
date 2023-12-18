import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double[] array = new double[n];
      double sum = 0;
      for(int i = 0;i < n;i++){
      	array[i] = (double) sc.nextInt();
        sum += (double) 1/array[i];
      }
      System.out.println(1/sum);
    }
}