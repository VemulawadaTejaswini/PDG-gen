import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static class Card implements Comparable<Card>{
		private char suite;
		private int value;
		
		public Card(char suite, int value) {
			super();
			this.suite = suite;
			this.value = value;
		}

		public int getValue(){
			return this.value;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + suite;
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Card other = (Card) obj;
			if (suite != other.suite)
				return false;
			if (value != other.value)
				return false;
			return true;
		}

		@Override
		public int compareTo(Card arg0) {
			return this.value - arg0.value;
		}
		
		@Override
		public String toString(){
			return this.suite + "" + this.value;
		}
	}
	
	public static boolean StableCheck(final int N, Card[] ord, Card[] sorted){
		int[] counts = new int[13];
		
		for(int i = 0; i < N; i++){
			final int purpose = ord[i].getValue() - 1;
			int count = 0;
			
			//System.out.println(ord[i] + " " + (purpose) + " " + counts[purpose]);
			
			for(int j = 0; j < N; j++){
				//System.out.println("> " + sorted[j] + " " + (sorted[j].getValue() - 1) + " " + count);
				
				if(sorted[j].getValue() - 1 == purpose){
					if(count == counts[purpose]){
						if(!sorted[j].equals(ord[i])){
							return false;
						}else{
							break;
						}
					}else{
						count++;
					}
				}
			}
			
			counts[ord[i].value - 1]++;
		}
		
		return true;
	}
	
	public static void BubbleSort(final int N, Card[] A){
		while(true){
			boolean update = false;
			
			for(int i = N - 1; i >= 1; i--){
				if(A[i].compareTo(A[i - 1]) < 0){
					Card tmp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = tmp;
					update = true;
				}
			}
			
			if(!update){
				break;
			}
		}
		
		
	}
	
	public static void SelectionSort(final int N, Card[] A){
		for(int i = 0; i < N; i++){
			Card min = A[i];
			int min_pos = i;
			
			for(int j = i + 1; j < N; j++){
				if(A[j].compareTo(min) < 0){
					min = A[j];
					min_pos = j;
				}
			}
			
			if(min_pos != i){
				Card tmp = A[i];
				A[i] = min;
				A[min_pos] = tmp;
			}
		}
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		Card[] ord = new Card[N];
		Card[] bubble = new Card[N];
		Card[] selection = new Card[N];		
		
		for(int i = 0; i < N; i++){
			String input = sc.next();
			
			ord[i] = new Card(input.charAt(0), Integer.parseInt(input.substring(1)));
			bubble[i] = new Card(input.charAt(0), Integer.parseInt(input.substring(1)));
			selection[i] = new Card(input.charAt(0), Integer.parseInt(input.substring(1)));
		}
		
		BubbleSort(N, bubble);
		for(int i = 0; i < N; i++){
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(bubble[i]);
		}
		System.out.println();
		
		System.out.println(StableCheck(N, ord, bubble) ? "Stable" : "Not stable");
		
		SelectionSort(N, selection);
		for(int i = 0; i < N; i++){
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(selection[i]);
		}
		System.out.println();
		
		System.out.println(StableCheck(N, ord, selection) ? "Stable" : "Not stable");
		
		
	}
}