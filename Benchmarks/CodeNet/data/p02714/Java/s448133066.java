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
	for(int j=1;j<N-1;j++) {
		for(int i=0;i<j;i++) {
			if(S[i].equals(S[j])) {
				continue;
			}
			for(int k=j+1;k<N;k++) {
				if(j-i!=k-j) {
				if(!S[j].equals(S[k])&&!S[k].equals(S[i])&&(j-i!=k-j)){
					ans++;
				}}
			}
		}

	}
	System.out.println(ans);


	}
	}
}
