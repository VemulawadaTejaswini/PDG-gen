import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static class Dice{
		int p1, p2, p3, p4, p5, p6;

		public Dice(int p1, int p2, int p3, int p4, int p5, int p6) {
			super();
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
			this.p4 = p4;
			this.p5 = p5;
			this.p6 = p6;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Dice){
				Dice ano = (Dice) obj;
				return this.p1 == ano.p1 && 
						this.p2 == ano.p2 &&
						this.p3 == ano.p3 &&
						this.p4 == ano.p4 &&
						this.p5 == ano.p5 &&
						this.p6 == ano.p6;
			}else{
				return false;
			}
		}

		@Override
		public String toString() {
			return "Dice [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4="
					+ p4 + ", p5=" + p5 + ", p6=" + p6 + "]";
		}
	}
	
	public static class Pair implements Comparable<Pair>{
		int p1, p2;
		
		public Pair(int t1, int t2){
			if(t1 > t2){
				p1 = t2;
				p2 = t1;
			}else{
				p1 = t1;
				p2 = t2;
			}
		}

		@Override
		public int compareTo(Pair o) {
			return this.p1 - o.p1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Red", "Yellow", "Blue", "Magenta", "Green", "Cyan"};
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Dice[] array = new Dice[n];
			for(int i = 0; i < n; i++){
				int[] numbers = new int[6];
				
				for(int j = 0; j < 6; j++){
					String str = sc.next();
					
					for(int k = 0; k < 6; k++){
						if(str.equals(names[k])){
							numbers[j] = k;
							break;
						}
					}
				}
				
				Pair[] pairs = 
					{
						new Pair(numbers[0], numbers[5]),
						new Pair(numbers[1], numbers[4]),
						new Pair(numbers[2], numbers[3]),
					};
				Arrays.sort(pairs);
				
				array[i] = new Dice(pairs[0].p1, pairs[0].p2, pairs[1].p1, pairs[1].p2, pairs[2].p1, pairs[2].p2);
			}
			
			//for(int i = 0; i < n; i++){
			//	System.out.println(array[i]);
			//}
			
			for(int i = 0; i < n; i++){
				if(array[i] == null){
					continue;
				}
				
				for(int j = i + 1; j < n; j++){
					if(array[i].equals(array[j])){
						array[j] = null;
					}
				}
			}
			
			int count = 0;
			for(int i = 0; i < n; i++){
				if(array[i] != null){
					count++;
				}
			}
			System.out.println(n - count);
		}

	}

}