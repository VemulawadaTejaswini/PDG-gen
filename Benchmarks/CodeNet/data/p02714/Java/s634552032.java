
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		int num=0;
		for(int k = N; k>=4; k--) {
			for(int j = k-1; j>=2; j--) {
				if(check12(S,j,k)==true) {
					for(int i = j-1; i>=1; i--) {
						if(j-i!=k-j) {
							if(check1(S,i,j,k)==true) {
								num++;
							}
						}
					}
				}
			}
		}
		System.out.println(num);

	}

	public static boolean check1(String S,int i,int j,int k) {
		String[] strArray = S.split("");
		if((strArray[i-1].equals(strArray[j-1])) || (strArray[i-1].equals(strArray[k-1])) || (strArray[j-1].equals(strArray[k-1]))){
			return false;
		}else {
			return true;
		}
	}

	public static boolean check12(String S, int j,int k) {
		String[] strArray = S.split("");
		if((strArray[j-1].equals(strArray[k-1]))){
			return false;
		}else {
			return true;
		}
	}
}
