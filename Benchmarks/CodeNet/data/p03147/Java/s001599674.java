import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			h[i] = sc.nextInt();
		}
h[0]=0;
int ans=0;
for (int i =0; i <= n-1; i++) {
if(h[i]<h[i+1]){
ans+=h[i+1]-h[i];
}
}
System.out.println(ans);
	}
}