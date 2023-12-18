import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			x[i] = sc.nextInt();
			y[i] = x[i];
		}
x[0]=0;
y[0]=0;
int max=0;
int ans=0;
for (int i = 1; i <= n; i++) {
if(max<=x[i]){
	max=x[i];
ans++;
}


}

System.out.println(ans);
	}
}