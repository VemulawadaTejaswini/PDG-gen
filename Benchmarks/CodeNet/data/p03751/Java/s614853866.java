import java.util.Scanner;

public class Main {
	static boolean win(StringBuilder a, StringBuilder b){
		StringBuilder c = new StringBuilder(a);
		StringBuilder d = new StringBuilder(b);
		for(int i=0; i<c.length(); i++){
			if(c.charAt(i) == '?') c.setCharAt(i, 'a');
		}
		for(int i=0; i<d.length(); i++){
			if(d.charAt(i) == '?') d.setCharAt(i, 'z');
		}
		for(int i=0; i<c.length() && i < d.length(); i++){
			if(c.charAt(i) != d.charAt(i)){
				return c.charAt(i) < d.charAt(i);
			}
		}
		return c.length() <= d.length();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder s[] = new StringBuilder[n];
		StringBuilder t;
		for(int i=0; i<n; i++) s[i] = new StringBuilder(sc.next());
		t = new StringBuilder(sc.next());
		int low = 0, high = 0;
		for(int i=0; i<n; i++){
			boolean p1 = win(t, s[i]);
			boolean p2 = win(s[i], t);
			if(p1 && p2){
				high++;
			}
			else if(p2){
				low++;
				high++;
			}			
		}
		sc.close();
		for(int i=low+1; i<=high+1; i++){
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}
