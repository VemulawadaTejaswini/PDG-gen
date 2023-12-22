import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,count;
		boolean p[]=new boolean[10001];
		//
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(i=2;i<=10000;i++){
			if(p[i])
				for(j=2;i*j<=10000;j++){
					p[i*j]=false;
				}
		}//
		while(sc.hasNext()){
			n=sc.nextInt();
			count=0;
			for(i=1;i<=n;i++){
				//System.out.println(i+""+p[i]+" "+(n-i+1)+""+p[n-i+1]);
				if(p[i] && p[n-i+1]) count++;
			}
			System.out.println(count);
		}//
	}
}