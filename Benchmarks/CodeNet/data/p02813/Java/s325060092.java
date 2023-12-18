import java.util.Scanner;

public class Main {
static String p = "";
static String q = "";
static int intp=0;
static int intq=0;
static int count=0;
static String tmp = "";
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++){
			p += sc.next();
		}
		sc.nextLine();
		for(int i = 0;i<n;i++){
			q += sc.next();
		}
		String nString = "";
		for(int i = 1;i<n+1;i++){
			nString +=i;
		}
		permutation(nString, "");
		System.out.println(Math.abs(intp - intq));
	}

		public static void permutation(String q, String ans){
			// Base Case
			if(q.length() <= 1) {
				count++;
				tmp = ans;
				tmp +=q;
				if(tmp.equals(p)){
					intp = count;
				}else if(tmp.equals(q)){
					intq = count;
				}

			}
			// General Case
			else {
				for (int i = 0; i < q.length(); i++) {
					permutation(q.substring(0, i) + q.substring(i + 1),
							ans + q.charAt(i));
				}
			}
		}
}