import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int[] child = new int[S.length()];
		for(int i=0; i< child.length; i++){
			child[i] = 1;
		}

		for (int i=1; i<=100; i++){
			int[] movedChild = new int[S.length()];
			for (int j=0; j<S.length(); j++){
				if (S.charAt(j) == 'L'){
					movedChild[j-1] += child[j];
				} else {
					movedChild[j+1] += child[j];
				}
			}
			child = movedChild;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<child.length; i++){
			if (i > 0){
				sb.append(" ");
			}
			sb.append(child[i]);
		}
		System.out.println(sb.toString());
	}
}