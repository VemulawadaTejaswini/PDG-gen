import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		
		int n = sc.nextInt();
		int[] count = new int['Z'+1];
		for(int i = 0 ; i < n ; i++){
			String b = sc.next();
			
			count[b.charAt(0)]++;
		}
		
		long mar = count['M']*count['A']*count['R'];
		long mac = count['M']*count['A']*count['C'];
		long mah = count['M']*count['A']*count['H'];
		long mrc = count['M']*count['R']*count['C'];
		long mrh = count['M']*count['R']*count['H'];
		long mch = count['M']*count['C']*count['H'];
		long arc = count['A']*count['R']*count['C'];
		long arh = count['A']*count['R']*count['H'];
		long ach = count['A']*count['C']*count['H'];
		long rch = count['R']*count['C']*count['H'];
		
		System.out.println(mar+mac+mah+mrc+mrh+mch+arc+arh+ach+rch);
	}
}
