import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int Sum = 0 ;
		int Min = 0;
		int Max = 0;
		
		 for(int i = 1; i <=a.length; i++) {
			 
			 a[i] = sc.nextInt();
			 Sum += a[i];
			 Min = a[1];
		
		 }
		 
		 for(int i = 1; i <=a.length; i++) {
				 Max = Math.max(Max, a[i]);
				 Min = Math.min(Min, a[i]);
				 }
		 System.out.println(Min +" "+ Max+" " +Sum);
			 
	sc.close();
		 }

  }