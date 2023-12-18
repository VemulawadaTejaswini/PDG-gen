import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int k = sc.nextInt();
		sc.close();
		
		char[] c = new char[len];
		int[] ci = new int[len];
		for(int i=0; i<len; i++){
			c[i] = s.charAt(i);
			ci[i] = c[i] - 97;
		}
		
		int i = 0;
		while(k>0 && i<len-1){
			if(c[i] != 0 && 26 - ci[i] <= k){
				k -= 26 - ci[i];
				ci[i] = 0;
			}
			i++;
		}
		
		ci[len-1] += k%26;
		if(ci[len-1] > 25){
			ci[len-1] -= 26;
		}
		

		for(int j=0; j<len; j++){
			c[j] = (char)(ci[j] + 97);
			System.out.print(c[j]);
		}
	}

}
