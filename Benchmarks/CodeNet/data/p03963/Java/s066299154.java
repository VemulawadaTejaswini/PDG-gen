import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long sum=1;
		int all = 2147483647;
		for(int i=0;i<a;i++){
			sum*=b;
			if(i==0)
				b--;
		}
		if(sum*-1>0||sum>all){
			sum = 2147483647;
		}
		System.out.print(sum);
	}
}
