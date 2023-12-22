import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Recursion {
	static List<Integer> results = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			aList.add(sc.nextInt());
		}
		int q = sc.nextInt();
		List<Integer> mList = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			mList.add(sc.nextInt());
		}
		for (Integer a : aList) {
			results.add(a);
		}
		createResults(aList);
		
		for(Integer m : mList) {
			if(results.stream().anyMatch(result -> result.equals(m))) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
	public static void createResults(List<Integer> aList) {
		for (int i = 0; i < aList.size(); i++) {
			for (int j = i + 1; j < aList.size(); j++ ) {
				results.add(aList.get(i) + aList.get(j));
				}
			aList.remove(i);
			createResults(aList);
			}
		}
}