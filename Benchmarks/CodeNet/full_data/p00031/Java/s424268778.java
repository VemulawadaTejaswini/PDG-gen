import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int now = 9;
		int[] tmp = new int[10];
		int weight = sc.nextInt();

		int max = -1;
		for(int i = 0; i < 10; i++) tmp[i] = 0;

		while(weight > 0) 
		{
		  if(weight>=Math.pow(2, now)) 
		  {
		   if(max == -1) max = now; 
		    tmp[now] = 1;
		    weight -= Math.pow(2, now);
		  }
		  now--;
		}
		for(int i = 0; i < 10; i++)
		{
		  if(tmp[i] == 1)
		  {
		  System.out.print((int)Math.pow(2, i));
		    if(i != max)System.out.print(" ");
		  }
		}
		System.out.println("");
		}
	}
}
