import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int length = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		int countMax = 0;

		for(int i = 0; i < length - 1; i++){
			String a = str.substring(0, i + 1);
			String b = str.substring(i + 1, length);

			int count = count(a, b);
			if(countMax < count){
				countMax = count;
			}
		}

		System.out.println(countMax);
	}

	public static int count(String a, String b){
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		for(char c : a.toCharArray()){
			set1.add(c);
		}
		for(char c : b.toCharArray()){
			set2.add(c);
		}
		set1.retainAll(set2);
		return set1.size();
	}
}
