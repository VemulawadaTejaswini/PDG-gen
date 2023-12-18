import java.util.ArrayList;
import java.util.Scanner;


public class ABC {
	 public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			int b[] = new int[n];
			b[0] = a[0];
			int count = 0;
			for(int i = 0;i<a.length-1;i++)
			{
				b[i+1] = b[i] + a[i+1]; 
				if(b[i+1]*b[i]>0)
				{
					count += Math.abs(b[i+1])+1;
					if(b[i+1]>0) b[i+1]=-1;
					else b[i+1] = 1;
				}
				else if(b[i+1] == 0)
				{
					if(b[i]>0) b[i+1]=-1;
					else b[i+1] = 1;
					count++;
				}
			}
			System.out.println(count);
			
		  }

}
