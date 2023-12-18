import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m =sc.nextInt();
		int[] a= new int[m];
		int[] b = new int[m];
		int ans=1;
		for(int i = 0; i<m; i++){
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			a[i]=a1;
			b[i]=b1;
		}
		for(int i = 0; i<m; i++){
			for(int j=i+1; j<m; j++){
				if(a[j]>=b[i]){
					i=j-1;
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}