import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	String[] S=new String[N];
	int total=N;
	for(int i=0;i<N;i++) {
		S[i]=sc.next();
	}
	for(int i=0;i<N-1;i++) {
		for(int j=i+1;j<N;j++) {
			if(S[i].equals(S[j])) {
				total--;
			}
		}
	}
	System.out.println(total);
	}
}
