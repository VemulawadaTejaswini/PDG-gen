import java.util.Scanner;
public class Main {

@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	String S2=sc.next();
	String S[]=S2.split("");
	long ans=0;
	if(N<=3) {
		System.out.println(0);
	}else {
	int middle=N/2;
	for(int j=1;j<middle;j++) {
		for(int i=0;i<j;i++) {
			if(S[i].equals(S[j])) {
				continue;
			}
			for(int k=j+1;k<N;k++) {
				if(!S[j].equals(S[k])&&!S[k].equals(S[i])&&(j-i!=k-j)){
					ans++;
				}
			}
		}

	}
	for(int j=N-2;j>=middle;j--) {
		for(int k=N-1;k>j;k--) {
			if(S[k].equals(S[j])) {
				continue;
			}
			for(int i=j-1;i>=0;i--) {
				if(!S[j].equals(S[i])&&!S[k].equals(S[i])&&(j-i!=k-j)){
					ans++;
				}
			}
		}

	}

	System.out.println(ans);


	}
	}
}
