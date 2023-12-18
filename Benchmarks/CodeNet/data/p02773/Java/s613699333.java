import java.util.*;
class Main{
	public static void main(String ags[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] count = new int[n];
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++){	
			s[i] = sc.next();
			list.add(s[i]);
			if (list.contains(s[i]))
				count[list.indexOf(s[i])]++;
		}
		//~ System.out.println(Arrays.toString(count));
		int max = Arrays.stream(count).max().getAsInt();
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++){
			if (count[i] == max)
				list1.add(s[i]);
		}	
		Collections.sort(list1);
		for (int i = 0; i < list1.size(); i++)
			System.out.println(list.get(i));
	}
}
