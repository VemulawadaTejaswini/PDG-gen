import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[n+1];
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			String s=sc.next();
			if(x[a]==3 || x[a]==1)
				continue;
			if(s.equals("AC")) {
				if(x[a]==2)
					x[a]=3;
				else
					x[a]=1;
			}else {
				x[a]=2;
			}
		}
		int sum=0,num=0;
		for(int i=0;i<n+1;i++) {
			if(x[i]==3) {
				sum++;
				num++;
			}else if(x[i]==1)
				sum++;
		}
		System.out.print(sum+" "+num);
	}
} 