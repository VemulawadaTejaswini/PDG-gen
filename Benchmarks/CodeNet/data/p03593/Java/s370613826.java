import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		String[] tempa = temp.split(" ");
		int H = Integer.parseInt(tempa[0]);
		int W = Integer.parseInt(tempa[1]);
		String[] ss = new String[H];
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for(int i = 0; i<H; i++) {
			ss[i] = sc.nextLine();
			for(int j=0; j<ss[i].length(); j++) {
				char c = ss[i].charAt(j);
				if(m.containsKey(c)) {
					int tempcount = m.get(c);
					m.put(c, tempcount+1);
				} else {
					m.put(c, 1);
				}
			}
		}
		sc.close();
		int onecount = 0;
		int twocount =0;
		int fourcount = 0;
		int oddcount = 0;
		for(Map.Entry<Character, Integer> ent : m.entrySet()) {
			int v = ent.getValue();
			if(v%2==0) {
				fourcount += v/4;
				twocount += (v-4*(v/4))/2;
			} else {
				oddcount++;
				if(v==1) {
					onecount++;
				}
			}
		}
		if(W%2==0 && H%2==0) {
			if(twocount==0&&oddcount==0&&onecount==0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else if((W%2==1 && H%2==0) || (W%2==0 && H%2==1)) {
			int even = 0;
			int odd = 0;
			if(W%2==0) {
				even = W;
				odd = H;
			} else {
				even = H;
				odd = W;
			}
			if(onecount==0 && oddcount==0 && (twocount<=even/2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if(onecount==1 && oddcount==1 && (twocount<=(H-1)/2+(W-1)/2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}