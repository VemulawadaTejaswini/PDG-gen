
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Mono> maxList = new ArrayList<>();
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int w = scanner.nextInt();
		List<Mono> list = new ArrayList<>();
		for(int i = 0; i < n; i++){
			list.add(new Mono(scanner.nextInt(), scanner.nextInt()));
		}
		souatari(list, new ArrayList<>(), w);
		int total = 0;
		for(Mono mono : maxList){
			total += mono.value;
		}
		System.out.println(total);
	}
	
	
	private static void souatari(List<Mono> list, List<Mono> bag, int maxWeight){
		for(Mono mono: list){
			if(weightCheck(bag, mono, maxWeight)){
				List<Mono> list2 = new ArrayList<>(list);
				List<Mono> bag2  = new ArrayList<>(bag);
				list2.remove(mono);
				bag2.add(mono);
				souatari(list2, bag2, maxWeight);
			}
		}
		maxComp(bag);
	}
	
	private static boolean weightCheck(List<Mono> list, Mono mono, int maxWeight){
		int total = mono.getWeight();
		for(Mono m: list){
			total += m.getWeight();
		}
		return total <= maxWeight; 
	}
	private static void maxComp(List<Mono> list){
		int totalA = 0;
		for(Mono mono: list){
			totalA += mono.value;
		}
		int totalB = 0;
		for(Mono mono: maxList){
			totalB += mono.value;
		}
		if(totalA > totalB){
			maxList = list;
		}
	}
	
	private static class Mono{ 
		private int weight = 0;
		private int value  = 0;
		public Mono(int weight, int value) {
			this.weight = weight;
			this.value = value;
		}
		public int getWeight() {
			return weight;
		}
		public int getValue() {
			return value;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public void setValue(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.weight + " " + this.value;
		}
		
	}
}
