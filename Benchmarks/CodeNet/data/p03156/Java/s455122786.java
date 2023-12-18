import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d[]=new int[a];
		for(int i=0;i!=a;i++) {
			d[i]=scan.nextInt();
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int ans=0;
		for(int i=0;i!=a;i++) {
			if(count1!=1&&d[i]<=b&&d[i]!=0) {
				count1=1;
				d[i]=0;
			}
			if(count2!=1&&d[i]>b&&d[i]<=c&&d[i]!=0) {
				count2=1;
				d[i]=0;
			}
			if(count3!=1&&d[i]>c&&d[i]!=0) {
				count3=1;
				d[i]=0;
			}
			if(count1==1&&count2==1&&count3==1) {
				ans++;
				i=0;
				count1=0;
				count2=0;
				count3=0;
			}
		}
		System.out.println(ans);
}
}