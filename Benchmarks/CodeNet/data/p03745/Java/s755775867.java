import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		
		int pl=0;
		int count=1;
		for(int i=1;i<N-1;i++){
			if(pl==1 && a[i]-a[i-1]<0){
				count++;
				i++;
			}
			else if(pl==-1 && a[i]-a[i-1]>0){
				count++;
				i++;
			}
			if(a[i]-a[i-1]>0)pl=1;
			else if(a[i]-a[i-1]<0)pl=-1;
		}
		if(pl==1 && a[N-1]-a[N-2]<0)count++;
		else if(pl==-1 && a[N-1]-a[N-2]>0)count++;
		System.out.println(count);
	}
}
