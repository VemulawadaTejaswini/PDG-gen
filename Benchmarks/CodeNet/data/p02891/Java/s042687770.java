import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String S=sc.next();
	int K=sc.nextInt();
	long ans=0;
	String[] S2=S.split("");
	for(int i=1;i<S2.length;i++) {
		if(S2[i-1].equals(S2[i])) {
			ans++;
			S2[i]="1";
		}
	}
	if(S2[0].equals(S2[S2.length-1])) {
		ans++;
		System.out.println(ans*K-1);
		System.exit(0);
	}
	System.out.println(ans*K);

}
}