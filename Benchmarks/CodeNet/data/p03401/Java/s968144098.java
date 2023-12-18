import java.util.Scanner;

class Main{
	static int abs(int n){
		if(n < 0)
			return -n;
		return n;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int [] an = new int[n];
		int [] ans = new int[n];
		int iti = 0;
		for(int i = 0; i < n; i++){
			an[i] = stdIn.nextInt();
		}
		for(int i = 0; i < n; i++){
                        iti = 0;
			for(int j = 0; j < n; j++){
				if(i == j)
					continue;
				ans[i] += abs(an[j] - iti);
				iti = an[j];
			}
			ans[i] += abs(iti);
		}
		for(int i = 0; i < n; i++)
			System.out.println(ans[i]);
	}
}