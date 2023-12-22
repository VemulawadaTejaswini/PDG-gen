import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] v=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		int max=0;
		int maxPtr=0;
		for(int i=0;i<n;i++){
			if(v[i]>max){
				max=v[i];
				maxPtr=a[i];
			}
		}
		System.out.println(maxPtr+" "+max);
	}
}