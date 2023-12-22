import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			int c = sc.nextInt();
			int a = sc.nextInt();
			int n = sc.nextInt();
			int min = Math.min(Math.min(c,a),n);
			int team = min;
			c -= min;
			a -= min;
			min = Math.min(a,c/2);
			team += min;
			c -= min*2;
			team += c/3;
			System.out.println(team);
		}
	}
}