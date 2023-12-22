import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] x=new int [n];
		int [] y=new int [n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			y[i]=sc.nextInt();
		}
		int sam1=0;
		double sam2=0;
		double sam3=0;
		int sam8=0;
		for(int i=0;i<n;i++) {
			if(x[i]>=y[i]) {
				sam1+=x[i]-y[i];
				sam3+=(x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]);
			}
			else {
				sam1+=(y[i]-x[i]);
				sam3+=(y[i]-x[i])*(y[i]-x[i])*(y[i]-x[i]);
			}
			sam2+=(x[i]-y[i])*(x[i]-y[i]);
			if(i==0) {
				if(x[i]>=y[i]) {
					sam8=x[i]-y[i];
				}
				else {
					sam8=y[i]-x[i];
				}
			}
			else {
				if(x[i]>=y[i]) {
					if(sam8<x[i]-y[i]) {
						sam8=x[i]-y[i];
					}
				}
				else {
					if(sam8<y[i]-x[i]) {
						sam8=y[i]-x[i];
					}
				}
			}
		}
		sam3=Math.cbrt(sam3);
		sam2=Math.sqrt(sam2);
		System.out.println(sam1+"\n"+sam2+"\n"+sam3+"\n"+sam8);
		sc.close();
		}
	}
