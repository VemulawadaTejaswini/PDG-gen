import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int max=0;
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				if(max<a[i]){
					max=a[i];
				}
			}
			for(int i=0;i<n-1;i++){
				int sum=a[i];
				for(int j=i;j<n-1;j++){
					sum=sum+a[j+1];
					if(max<sum){
						max=sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}