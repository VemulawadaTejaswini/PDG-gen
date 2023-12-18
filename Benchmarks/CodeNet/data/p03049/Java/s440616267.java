import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] S = new String [n];
		
		int c_a = 0;
		int c_b = 0;
		int count = 0;
		
		for (int i = 0; i<n; i++){
			S [i] = sc.next();

			if (S[i].charAt(0)=='B')
				c_b++;
			
			if (S[i].charAt(S[i].length()-1)=='A')
				c_a++;
			
			int j = 0;
			while (j<S[i].length()-1){
				if (S[i].charAt(j)!='A'){
					j++;
				}
				else {
					if (S[i].charAt(j+1) =='B'){
						count++;
						j++;
					}
					else
						j++;
				}
			}
		}
		sc.close();
		if (n==1){
			System.out.println(count);
		}
		else
			System.out.println(count+Math.min(c_a, c_b));
	}
	

}
