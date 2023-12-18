import java.util.Scanner;
public class Main {
	static int N;
	static int Y;
	static int A=-1,B=-1,C=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		Y=sc.nextInt();
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=N-i;j++) {
				if(i*10000+j*5000+(N-i-j)*1000==Y) {
					A=i ;B=j;C=N-i-j;
				}
			}
		}
		System.out.println(A+" "+B+" "+C);
	}