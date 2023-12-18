import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static String implementation(List<String> array){
		int n = Integer.parseInt(array.get(0));
		Map<Integer, List<List<Integer>>> dishes = new HashMap<Integer, List<List<Integer>>>();
		for(int i = 1; i<n+1; i++){
			List<Integer> list = Arrays.stream(array.get(i).split(" ")).map(s -> {
				return Integer.parseInt(s);
			}).collect(Collectors.toList());

			int diff = Math.abs(list.get(0) + list.get(1));
			if (dishes.get(diff) == null){
				dishes.put(diff, new ArrayList<List<Integer>>());
				dishes.get(diff).add(list);
			} else {
				dishes.get(diff).add(list);
			}
		}

		long t = 0;
		long a = 0;
		boolean t_turn = true;

		for(int i = 0; i<n; i++){
			Object[] mapKey = dishes.keySet().toArray();
			Arrays.sort(mapKey);
			List tmp = Arrays.asList(mapKey);
			Collections.reverse(tmp);
			Object[] sortedKeys = (Object[])tmp.toArray(new Object[n]);

			int key = (int)sortedKeys[0];
			List<List<Integer>> list = dishes.get(key);

			int idx = 0;
			int t_score = 0;
			int a_score = 0;
			if(t_turn){
				for (int j = 0; j<list.size(); j++){
					if (Math.abs(t_score - a_score) < Math.abs(list.get(j).get(0) - list.get(j).get(1))){
						idx = j;
						t_score = list.get(j).get(0);
					}
				}
				t += list.get(idx).get(0);
				t_turn = false;
			} else {
				for (int j = 0; j<list.size(); j++){
					if (Math.abs(t_score - a_score) < Math.abs(list.get(j).get(0) - list.get(j).get(1))){
						idx = j;
						a_score = list.get(j).get(1);
					}
				}
				a += list.get(idx).get(1);
				t_turn = true;
			}
			list.remove(idx);
			if(list.size()==0){
				dishes.remove(key);
			}

		}

		return String.valueOf(t-a);
	}

	public static void main(String[] args){
		// Input
		Scanner sc = new Scanner(System.in);

		// Read input and execute method
		String tmp;
		List<String> array = new ArrayList<String>();
		while(true) {
			try {
				tmp = sc.nextLine();
				if (tmp.length() == 0) {
					exec(array);
					array.clear();
				} else {
					array.add(tmp);
				}
			} catch (Exception e){
				exec(array);
				break;
			}
		}
	}

	public static void exec(List<String> array){
		// Output variable
		String out = implementation(array);

		// Output
		PrintWriter stdOut = new PrintWriter(System.out);
		stdOut.println(out);
		stdOut.flush();

		// Debug
		if(array.get(array.size()-1).startsWith("a:")) {
			if (!array.get(array.size() - 1).substring(2).equals(out)) {
				System.out.println("error included");
				System.out.println("output : " + out);
				System.out.println("expected : " + array.get(array.size()-1).substring(2));
			} else {
				System.out.println("correct answer!!");
			}
			System.out.println("");
		}
	}
}
