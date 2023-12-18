import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int L=sc.nextInt();
	int R=sc.nextInt();
	sc.close();
	int ans=2018;
	for(int i=L;i<R;i++) {
		if(i*(i+1)%2019<ans) {
			ans=i*(i+1)%2019;
		}
	}
	System.out.println(ans);
}
}
