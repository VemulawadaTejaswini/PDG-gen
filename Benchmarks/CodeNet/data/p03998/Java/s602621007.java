import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		char[] C = sc.next().toCharArray();
		int a = 0,b = 0,c = 0;
		char point = 'a';
		while(true) {
			if(point == 'a') {
				if(!hasNext(A, a)){
					System.out.println('A');
					break;
				}
				point = A[a];
				a++;
			}else if(point == 'b') {
				if(!hasNext(B, b)){
					System.out.println('B');
					break;
				}
				point = B[b];
				b++;
			}else {
				if(!hasNext(C, c)){
					System.out.println('C');
					break;
				}
				point = C[c];
				c++;
			}

		}

	}

	public static boolean hasNext(char[] ary,int point){
		if(ary.length == point) return false;
		return true;
	}
}