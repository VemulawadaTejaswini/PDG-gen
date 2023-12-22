import java.util.Scanner;
public class Main {


@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String S2=sc.next();
	String[] S3=S2.split("");
	int[] S=new int[S3.length];
	for(int i=0;i<S.length;i++) {
		S[i]=Integer.valueOf(S3[i]);
	}
	int[][] gra=new int[S.length][S.length];
	long kari=0;
	long ans=0;
	for(int j=0;j<S.length;j++) {
	for(int i=j;i<S.length;i++) {
		kari+=S[i];
		if(kari%2019==0) {
			ans++;
			kari=0;
			gra[j][i]++;
			System.out.println(j+" "+i);
			break;
		}

		kari*=10;

	}
	kari=0;
	}


	System.out.println(ans);

}
}