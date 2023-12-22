import java.util.Scanner;

public class J10004{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] a;
		a=new int[3];
		for(int i=0;i<3;i++)a[i]=sc.nextInt();
		for(int i=0;i<3;i++){
			for(int j=i+1;j<3;j++)if(a[i]>a[j]){
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
		System.out.printf("%d %d %d\n",a[0],a[1],a[2]);
	}
}