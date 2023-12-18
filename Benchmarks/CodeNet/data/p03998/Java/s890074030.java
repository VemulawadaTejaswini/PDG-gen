import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(),b=sc.next(),c=sc.next();
		StringBuilder A = new StringBuilder();
		StringBuilder B = new StringBuilder();
		StringBuilder C = new StringBuilder();
		A.append(a);
		B.append(b);
		C.append(c);
		char next = 'a';
		for(int i=0;i<301;i++) {
			if(next=='a') {
				if(A.length()==0) {
					System.out.println("A");
					break;
				}
				next = A.charAt(0);
				A.deleteCharAt(0);
			}else if(next=='b') {
				if(B.length()==0){
					System.out.println("B");
					break;
				}
				next = B.charAt(0);
				B.deleteCharAt(0);
			}else{
				if(C.length()==0) {
					System.out.println("C");
					break;
				}
				next = C.charAt(0);
				C.deleteCharAt(0);
			}
		}

	}
	public static int sample(int n) {
		return n;
	}

}
