/**
 * 
 */
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Neeraj
 *
 */
 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int d;
		int count=0;
		HashSet hs=new HashSet();
		while(k-->0) {
			
			
			
			d=sc.nextInt();
			for(int i=0;i<d;i++) {
			     	hs.add(sc.nextInt());
			}
			
			
		}
		System.out.println(n-hs.size());
	}

}
