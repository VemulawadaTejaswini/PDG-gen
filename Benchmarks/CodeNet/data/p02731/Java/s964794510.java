import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		double max=0;
		for(double i =1;i<s-2;i=i+1){
			for(double j=1;j<s-1;j=j+1){
				double k = s-i-j;
				if((i*j*k)>max){
					max = i*j*k;
				}
			}
		}
		System.out.print(max);
	}
}