import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int tmp;
		int n=in.nextInt();
		int num[]= new int[n];
		for (int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		for (int i=0;i<n-1;i++) {
			for (int j=n-1;j>i;j--) {
				if (num[j]<num[j-1]) {
					tmp=num[j];
					num[j]=num[j-1];
					num[j-1]=tmp;
				}
			}
		}
		for(int i=0;i<n;i++){
			if (i==n-1) {
				System.out.printf("%d",num[i]);
			}else{
				System.out.printf("%d ",num[i]);
			}
		}
		System.out.printf("%n");
	}
}