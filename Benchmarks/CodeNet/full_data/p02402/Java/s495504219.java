import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,max=-1000001,min=1000001;
		long sum=0;
		n=stdIn.nextInt();
		for(int i=0;i<n;i++){
			int a=stdIn.nextInt();
			if(a>max)
				max=a;
			if(a<min)
				min=a;
			sum+=a;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}