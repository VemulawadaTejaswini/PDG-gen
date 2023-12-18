import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		int count = 0;
		for(int i =0; i< N; i++) {
			if(A.charAt(i) == B.charAt(i) && A.charAt(i) == C.charAt(i)) {
				//全部一緒はつぎへ
				continue;
			}

			if(A.charAt(i) != B.charAt(i) && A.charAt(i) == C.charAt(i)) {
				//Bだけ違う
				count++;
				continue;
			}
			if(A.charAt(i) == B.charAt(i) && A.charAt(i) != C.charAt(i)) {
				//Ｃだけ
				count++;
				continue;
			}
			if(A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) != C.charAt(i) ) {
				//AもBもCも違う
				count = count + 2;
				continue;
			}
			if(A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) == C.charAt(i)) {
				count++;
				continue;
			}
		}

        System.out.println(count);


	}

}