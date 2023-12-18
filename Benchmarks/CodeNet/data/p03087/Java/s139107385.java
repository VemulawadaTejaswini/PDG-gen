import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[n];
		int[] r = new int[n];
		
		int[] count = new int[q];
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			
			String str = s.substring(l[i]-1, r[i]);
			int cont = 0;
			for(int j = 0; j < str.length()-1; j++) {
				if (str.charAt(j) == 'A' && str.charAt(j+1) == 'C') {
					cont++;
				}
			}
			count[i] = cont;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
	}

}
