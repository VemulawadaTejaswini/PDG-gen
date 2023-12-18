import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// input:N枚のカード
		// input conditon
		// 1<= N <= 100
		// ai(1<= i <= N) は1以上100以下
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N<1 || N>100) {
			System.out.println("N is illegal");
			System.exit(1);
		}
		
		int number_array[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			 
			int a_i = scan.nextInt();
			if(a_i < 1 || a_i > 100 ) {
				System.out.println("N is illegal");
				System.exit(1);
			}
			number_array[i] = a_i;
		}
		//debug print
		//printArray(number_array);
		
		// condition:
		//	Alice/Bobは残ったカードのうち、最大の値のカードを選択する
		//	Aliceが先行
		
		//logic
		//	1.リストのうち、最大の値を検索し、取り出す。
		//		検索処理回数が(N/2 - 1)
		//  2.始めに大きい順にソートして、リストの頭から順次取り出す ★
		//		検索処理回数は0,ソート回数1
		int Alice_point = 0, Bob_point = 0;
		int difference = 0;
		
		//ソートして整列
		//number_array = quicksort(number_array);
		Arrays.sort(number_array);
		//printArray(number_array);
		//System.exit(1);
		
		Deque<Integer> stack = arrayToStack(number_array);
		//(繰り返し)
		//	奇数番目なら、Alice_pointにデータ加算。偶数番目ならBob_pointにデータ加算。(listからどんどんデータを取っていく)
		//(listがからなら抜ける)
		for(int turn = 1; turn <= N; turn++) {
			if(turn % 2 == 1) Alice_point = Alice_point + stack.pop();  
			if(turn % 2 == 0) Bob_point = Bob_point + stack.pop();
		}
		if(!stack.isEmpty()) System.out.println("Card is rest yet.");
		
		// output:Alice は Bob より何点多く取るか
		difference = Alice_point - Bob_point;
		System.out.println(String.valueOf(difference));
	}

	
	public static Deque<Integer> arrayToStack(int[] array) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		for(int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		return stack;
	}
	
	public static void printArray(int[] array) {
		System.out.println("---debug print----");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-------------------");
	}

}
