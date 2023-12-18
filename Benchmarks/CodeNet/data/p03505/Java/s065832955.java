import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int K=in.nextInt();
int A=in.nextInt();
int B=in.nextInt();
int N=0;
if (A<K & A<B) {
	System.out.println(-1);
}
else if(A<B & A>K) {
	System.out.println(1);
}
else if(A>B & A<K) {
N=(K-A)/(A-B)+1;
	System.out.println(2*N+1);
}

	}

}
