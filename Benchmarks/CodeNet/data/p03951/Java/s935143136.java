import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		
		int pos = n;
		for(int i= 0; i<n; i++){
			boolean c = true;
			for(int j=i; j<n-i; j++){
				if(s[i+j] != t[j]){
					c = false;
					break;
				}
			}
			if(c){
				pos = i;
				break;
			}
		}
		
		System.out.println(pos+n);
	}

}