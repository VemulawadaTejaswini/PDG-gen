import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String[] distinct = S.split("");		
		int[] kid = new int[distinct.length];
		int[] afterKid = new int[distinct.length];
		for(int i = 0; i < kid.length; i++) {
			kid[i] = 1;
		}
		
		for(int j = 0; j < 1000; j++) {
			for(int k = 1; k < kid.length - 1; k++) {
				if(distinct[1].equals("L")) {
					afterKid[0] = kid[1];
				}
				
				if(distinct[k - 1].equals("R")) {		
					afterKid[k] += kid[k - 1];
				}
				if(distinct[k + 1].equals("L")) {
					afterKid[k] += kid[k + 1];
				}
				
				if(distinct[kid.length-2].equals("R")) {
					afterKid[kid.length-1]= kid[kid.length - 2];
				}
			}
			for(int m = 0; m < kid.length; m++) {
				kid[m] = afterKid[m];
				afterKid[m] = 0;
			}
		}
		for(int o = 0; o < kid.length; o++) {
			System.out.print(kid[o] + " ");
		}
	}

}