import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String ux = x.toUpperCase();
		String lx = x.toLowerCase();
		String w[] = x.split("");
		String uw[] = ux.split("");
		String lw[] = lx.split("");
		String[] q;
		q = new String[1200];
		int i;
		for(i = 0; i < x.length(); i++){
			if(w[i].equals(uw[i]))
				q[i] = lw[i];
			else
				q[i] = uw[i];
		}
		for(i = 0; i < x.length(); i++){
			System.out.print(q[i]);
		}
		System.out.println();
	}
}