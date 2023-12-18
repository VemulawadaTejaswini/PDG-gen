import java.util.Scanner;
public class Main {


@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String S2=sc.next();
	String[] S3=S2.split("");
	long[] S=new long[S3.length];
	for(int i=0;i<S.length;i++) {
		S[i]=Integer.valueOf(S3[i]);
	}
	int[] start=new int[S.length];
	int[] finish=new int[S.length];
	long kari=0;
	long ans=0;
	for(int j=0;j<S.length;j++) {
	for(int i=j;i<S.length;i++) {
		kari+=S[i];
		if(kari>=10000000) {
			break;
		}
		if(kari%2019==0) {
			ans++;
			start[j]++;
			finish[i]++;
			//System.out.println(j+" "+i);
			break;
		}
		kari*=10;

	}
	kari=0;
	}
	for(int i=0;i<S.length-1;i++) {
		ans+=finish[i]*start[i+1];
	}


	System.out.println(ans);

}
}