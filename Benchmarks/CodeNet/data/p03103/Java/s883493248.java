package test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[] drinkList = new int [N];
		HashMap <Integer,Integer> costAmount = new HashMap <Integer,Integer>();
		HashMap <Integer,Integer> costIndex = new HashMap <Integer,Integer>();

		int listIndex = 0;
		for (int index=0; index<N; index++) {
			int cost = scanner.nextInt();
			int amount = scanner.nextInt();

			if (Arrays.asList(drinkList).contains(cost)) {
				int tempIndex = costIndex.get(cost);
				int tempAmount = costAmount.get(cost);
				int newAmount = drinkList[tempIndex]+tempAmount;
				drinkList[tempIndex]=newAmount;
				costAmount.remove(cost);
				costAmount.put(cost,newAmount);
			} else {
				drinkList[listIndex] = cost;
				costAmount.put(cost, amount);
				costIndex.put(cost,listIndex);
				listIndex++;
			}
		}

		Long nowAmount = 0l;
		Long money = 0l;

		Arrays.sort(drinkList);
		for (int index=0; index<M; index++) {
			if (M-nowAmount>costAmount.get(drinkList[index])) {
				nowAmount+=costAmount.get(drinkList[index]);
				money+=(costAmount.get(drinkList[index]))*drinkList[index];
			} else {
				money+=(M-nowAmount)*drinkList[index];
				break;
			}
		}

		System.out.println(money);
	}
}