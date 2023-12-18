import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d[]=new int[b];
		for(int i=0;i!=b;i++) {
			d[i]=scan.nextInt();
		}
		int count=0;
		for(int i=c;i!=a;i++) {
			for(int j=0;j!=b;j++) {
				if(i==d[j]) {
					count++;
				}
			}
		}
		int count2=0;
		for(int i=c;i!=0;i--) {
			for(int j=0;j!=b;j++) {
				if(i==d[j]) {
					count2++;
				}
			}
		}
		System.out.println(count<=count2?count:count2);
		}
}