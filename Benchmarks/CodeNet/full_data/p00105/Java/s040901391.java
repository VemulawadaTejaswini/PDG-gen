import java.util.*;

public class Main{
	
	public static void main(String[] args){

		Map<String, List<Integer>> index = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String keyWord = line.split(" ")[0];
			if(keyWord.equals("end")) break;
			int page = Integer.valueOf(line.split(" ")[1]);
			index.merge(keyWord, new ArrayList<Integer>(){{add(page);}}, (O, N) -> {N.addAll(O); return N;});
		}
		
		index.keySet().forEach(S -> {
			System.out.println(S);
			index.get(S).stream().mapToInt(Integer::intValue).sorted().findFirst().ifPresent(System.out::print);
			index.get(S).stream().mapToInt(Integer::intValue).sorted().skip(1).forEach(I -> System.out.print(" " + I));
			System.out.println();
		});
		sc.close();
	}
}