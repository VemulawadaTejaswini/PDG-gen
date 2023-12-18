import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			int sum=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int i=a;i<=b;i+=2){
				if(i==1)
					sum--;
				boolean t=true;
				for(int j=2;j<i;j++){
					if(i%j==0){
						t=false;
						break;
					}
				}
				boolean r=true;
				int u=(i+1)/2;
				for(int j=2;j<u;j++){
					if(u%j==0){
						r=false;
						break;
					}
				}
				if(t&&r)
					sum++;
			}
			System.out.println(sum);
		}
	}
}
