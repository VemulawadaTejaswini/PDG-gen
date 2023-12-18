import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		Set<Integer> waters = new HashSet<>();
		Set<Integer> sugers = new HashSet<>();
		for(int i = 0 ; 100 * a * i <= f ; i++) {
			for(int j = 0 ; 100 * a * i + 100 * b * j <= f ; j++) {
				waters.add(100 * a * i + 100 * b * j);
			}
		}
		for(int i = 0 ; i * c <= f ; i++) {
			for(int j = 0 ; i * c + j * d <= f ; j++) {
				sugers.add(i * c + j * d);
			}
		}
		int wa = 1, su = -1;
		for(int water : waters) {
			for(int suger : sugers) {
				if(suger + water <= f && su * water < suger * wa && e * water >= 100 * suger) {
					wa = water;
					su = suger;
				}
			}
		}
		System.out.println(su + wa + " " + su);
	}
}