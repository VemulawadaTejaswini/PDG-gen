import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] data;
		data=new int[n];
		for(int i=0;i<n;i++)data[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(data[i]>data[j]){
					int c=data[i];
					data[i]=data[j];
					data[j]=c;
				}
			}
		}
		for(int i=0;i<n;i++)System.out.printf("%d%c",data[i],i==n-1?'\n':' ');
	}
}