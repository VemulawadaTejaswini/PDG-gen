import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();
		Char[] c = s.toCharArray();

		int count = 1;

		for(int i=0; i<n-1; i++){
			if(!(c[i]==c[i+1])){
				count++;
			}
		}

		System.out.println(count);
	}
}
