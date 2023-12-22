import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		Scanner sc=new Scanner(str);
		int a;
		int min=10000;
		int max=0;
		int sum=0;
		for(;sc.hasNext();){
			a=sc.nextInt();
			sum+=a;
			if(a<=min)min=a;
			else if(a>=max)max=a;
			
		}
		System.out.printf("%d %d %d",min,max,sum);
		System.out.println();
		
	}
}