import java.util.*;

public class Main{
	
	public static void main(String[] args){

		Map<String, List<Integer>> index = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String keyWord = line.split(" ")[0];
			int page = Integer.valueOf(line.split(" ")[1]);
			index.merge(keyWord, new ArrayList<Integer>(){{add(page);}}, (O, N) -> {N.addAll(O); return N;});
		}
		
		index.keySet().forEach(S -> {
			System.out.println(S);
			index.get(S).stream().sorted().forEach(I -> System.out.print(I + " "));
			System.out.println();
		});
		sc.close();
	}
}