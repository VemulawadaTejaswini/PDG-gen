import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		char []c = sc.next().toCharArray();
		int []s = new int [n];
		
		s[0]  = 0;
		
		for(int i = 0 ; i < n-1 ;i++) {
			if(c[i] == 'A'&& c[i+1] == 'C') {
				s[i+1] = s[i] + 1 ;
			}
			else {
				s[i+1] = s[i];
			}
				
		}
		
		for(int j = 0; j < q ; j++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = s[r-1] - s[l-1];
			System.out.println(ans);
		}
		
		
		
	}

	}

