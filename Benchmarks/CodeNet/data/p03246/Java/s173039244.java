import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0;i < n;i++) {
			v[i] = sc.nextInt();
		}
		sc.close();
		Map<Integer,Integer> Odds = new TreeMap<>();
		Map<Integer, Integer> Evens = new TreeMap<>();
		for(int i = 0;i < n;i++) {
			if(i%2!=0) {
				if(Odds.containsKey(v[i])) {
					Odds.put(v[i], Odds.get(v[i])+1);
				}else {
					Odds.put(v[i], 1);
				}
			}else {
				if(Evens.containsKey(v[i])) {
					Evens.put(v[i], Evens.get(v[i])+1);
				}else {
					Evens.put(v[i], 1);
				}
			}
		}
		if(Odds.size()==1 && Evens.size()==1
				&& Odds.entrySet().stream().mapToInt(i -> i.getKey()).sum()
				!= Evens.entrySet().stream().mapToInt(i -> i.getKey()).sum()){
			System.out.println(0);
		}else if(Odds.size()==1 && Evens.size()==1
				&& Odds.entrySet().stream().mapToInt(i -> i.getKey()).sum()
				== Evens.entrySet().stream().mapToInt(i -> i.getKey()).sum()) {
			System.out.println(n/2);
		}else {
			Comparator<Entry<Integer,Integer>> comp = Entry.comparingByValue();
			Entry<Integer,Integer> maxOdds =Odds.entrySet().stream()
					.max(comp)
					.get();
			Entry<Integer,Integer> maxEvens =Evens.entrySet().stream()
					.max(comp)
					.get();
			Odds.remove(maxOdds.getKey());
			Evens.remove(maxEvens.getKey());
			int OddsSum = Odds.entrySet().stream()
					.mapToInt(i -> i.getValue())
					.sum();
			int EvensSum =  Evens.entrySet().stream()
					.mapToInt(i -> i.getValue())
					.sum();
			System.out.println(OddsSum + EvensSum);
		}
	}
}