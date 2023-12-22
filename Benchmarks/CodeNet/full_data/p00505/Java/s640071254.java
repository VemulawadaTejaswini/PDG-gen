import java.util.Arrays;
import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] =  {0,0,0};
		
		while(sc.hasNext()) {
			for(int i=0;i<3;i++)a[i]=sc.nextInt();
			Arrays.sort(a);
			
			if(a[2]>=a[0]+a[1])System.out.println((b[0]+b[1]+b[2])+" "+b[0]+" "+b[1]+" "+b[2]);
			else if(Math.pow(a[2], 2)==Math.pow(a[0], 2)+Math.pow(a[1], 2))b[0]++;
			else if(Math.pow(a[2], 2)<Math.pow(a[0], 2)+Math.pow(a[1], 2))b[1]++;
			else if(Math.pow(a[2], 2)>Math.pow(a[0], 2)+Math.pow(a[1], 2))b[2]++;
			else System.out.println("EEE");
			
		}
		
		sc.close();
	}
	
}
