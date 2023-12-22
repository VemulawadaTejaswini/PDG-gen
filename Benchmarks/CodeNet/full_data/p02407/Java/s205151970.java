import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x;
		int[] a=new int[n];
		for(x=0;x<n;x++){
		a[x] = sc.nextInt();
		}
		for(x=n-1;x>=0;x--){
		System.out.print(a[x]);
		if(x!=0){System.out.print(" ");}
		}
		System.out.println("");
	}
}