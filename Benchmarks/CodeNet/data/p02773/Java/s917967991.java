import java.util.*;
class Main{
	public static void main(String ags[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] count = new int[n];
		Set<String> list = new HashSet<>();
		for (int i = 0; i < n; i++){	
			s[i] = sc.next();
			list.add(s[i]);
			if (list.contains(s[i])){
				int index = new ArrayList<>(list).indexOf(s[i]);
				count[index]++;
				
			} 
		}
		//~ System.out.println(list + " " + Arrays.toString(count));
		List<String> l = new ArrayList<>(list);
		List<String> lg = new ArrayList<>();
		int max = Arrays.stream(count).max().getAsInt();
		for (int i = 0; i < list.size(); i++){
			if (count[i] == max)
					lg.add(l.get(i));
		}
		for (int i = 0; i < lg.size(); i++){
					System.out.println(lg.get(i));

		}
		
	}
}
