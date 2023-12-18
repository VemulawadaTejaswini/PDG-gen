import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> d = new ArrayList<>();
		for (int i=0;i < k;i++) {
			d.add(sc.nextInt());
		}
		Collections.sort(d);
		
		Integer min = 0;
		for (int i=0;i < 10;i++) {
			if (d.contains(i)) continue;
			min = i;
			break;
		}
		
		String nStr = n.toString();
		int[] amt = new int[nStr.length()];
		for (int i=0;i < nStr.length();i++) {
			amt[i] = Integer.parseInt(nStr.substring(i,i+1));
		}
		String ans = "";
		int ext = 0;
		for (int i=amt.length-1;i >= 0;i--) {
			int target = amt[i]+ext;
			ext = 0;
			
			while(d.contains(target)) {
				if (target > 9) break;
				target++;
			}
			if (target > 9) {
				ext = 1;
				target = min;
			}
			ans = target + ans;
			
			if (i==0 && ext==1) {
				if (min == 0) {
					for (Integer j=1;j < 10;j++) {
						if (d.contains(j)) continue;
						ans = j.toString();
						break;
					}
				} else {
					ans = min.toString();			
				}
				for (int j=0;j < amt.length;j++) {
					ans += min;
				}
			}
		}
		System.out.print(ans);
	}
}