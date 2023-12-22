import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		String[] vals = b.split(" ");
		int comp = Integer.parseInt(vals[0]);
		int c = Integer.parseInt(vals[1]);
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i = 0;i<c;i++) {
			String wfeihu = a.nextLine();
			String nums = a.nextLine();
			String[] d = nums.split(" ");
			for (int j=0;j<d.length;j++) {
				int p = Integer.parseInt(d[j]);
				if (!list.contains(p)) {
					list.add(p);
				}
			}
		}
		System.out.println(comp-list.size());
	}
		
}
