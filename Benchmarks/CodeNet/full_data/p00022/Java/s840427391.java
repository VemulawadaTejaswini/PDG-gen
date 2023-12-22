import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0) break;
			int max=0;
			int sum=0;
			for(int i=0; i<n; i++){
				sum += in.nextInt();
				if(max<sum) max=sum;
				else if(sum<0) sum=0;
			}
			System.out.println(max);
		}
	}
}