import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<HashSet<Integer>> groups = new ArrayList<>();
		for(int i=1;i<=n;i++)
			hs.add(i);
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (hs.contains(a)){
				boolean added = false;
				hs.remove(a);
				for(int j=0;j<groups.size();j++){
					if (groups.get(j).contains(b)){
						groups.get(j).add(a);
						added = true;
					}
				}
				if (!added){
					HashSet<Integer> hs2 = new HashSet<Integer>();
					hs2.add(a);
					groups.add(hs2);
				}
			}
			if (hs.contains(b)){
				groups.get(groups.size()-1).add(b);
			}
		}
		int max = 0;
		for(int i=0;i<groups.size();i++){
			if (max < groups.get(i).size())
				max = groups.get(i).size();
		}
		System.out.println(max);
		sc.close();
	}
}
