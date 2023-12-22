import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String b = new String(s.next());
		int L = b.length();
		int j = 0;
		
		String p[] = new String[n];
		
		for(int i=0; i<n; i++){
			p[i] = s.next();
		}
		
		for(int i=0; i<n; i++){
			int l = p[i].length();
			int x =0;
				for(int k=0; k<(int)l/2 + 1; k++){
					if(b.charAt(x) == p[i].charAt(k)){
						x++;
						if(b.charAt(L-1-k) != p[i].charAt(l-1-k))	break;
					}
					else	break;
					j++;
			}
		}
		System.out.print(j);
	}
}