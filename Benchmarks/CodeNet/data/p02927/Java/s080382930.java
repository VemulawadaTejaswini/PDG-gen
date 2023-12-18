import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	sc.nextLine();
      	
      	int a[] = new int[n];
      	for(int i = 0; i < n; i++)
        	a[i] = sc.nextInt();
      

      
      	long count = 0;
      	long sum = 0;
      for(int i = 0; i < n; i++)
          for(int j = i+1; j < n; j++)
            if(a[i] > a[j]) count++;
     	sum += count*k; 
     count = 0;
      
      for(int i = 0; i < n; i++){
          count = 0;
          for(int j = 0; j < n; j++)
            if(a[i] > a[j]) count++;
      
          for(int s = k-1; s > 0; s--)
          	sum += count*s;
      }
      	

		System.out.println(sum%1000000007);
	}
}