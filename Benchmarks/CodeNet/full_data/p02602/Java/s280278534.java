import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int x=k+1;x<=n;x++){
			if(a[x-1]>a[x-k-1]){System.out.println("Yes");}
			else{System.out.println("No");}
		}
	}
}
