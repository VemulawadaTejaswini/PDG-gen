import java.util.Scanner;
import java.util.HashSet;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long mod=1000000007;
		HashSet<Integer> a=new HashSet<>();
		HashSet<Integer> b=new HashSet<>();
		for(int i=0; i<n; i++){
			a.add(sc.nextInt());
		}
		for(int i=0; i<m; i++){
			b.add(sc.nextInt());
		}
		long ans=1;
		int row=0;
		int col=0;
		for(int i=n*m; i>=1; i--){
			if(a.contains(i) && b.contains(i)){
				row++;
				col++;
			}else if(a.contains(i)){
				ans*=col;
				row++;
			}else if(b.contains(i)){
				ans*=row;
				col++;
			}else{
				ans*=row*col-n*m+i;
			}
			ans%=mod;
		}
		System.out.println(ans);
	}
}
