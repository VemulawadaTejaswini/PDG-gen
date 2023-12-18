import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int cut = -1;
		int last = sc.nextInt();

		for(int i=1; i<n; i++) {
			int current = sc.nextInt();
			if(last+current>=l) {
				cut = i;
				break;
			}
			last = current;
		}
		if(cut==-1) System.out.println("Impossible");
		else {
			System.out.println("Possible");
			for(int i=1; i<cut; i++) System.out.println(i);
			for(int i=n-1; i>cut; i--) System.out.println(i);
			System.out.println(cut); 
		}
	}
}