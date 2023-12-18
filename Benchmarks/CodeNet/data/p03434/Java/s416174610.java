import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		int Alice=0;
		int Bob=0;
		// 整数の入力
		int a = sc.nextInt();
		
		int[] card = new int[a];
		
		for(int number=0;number<card.length;number++){
			card[number] = sc.nextInt();
		}
		
		int max = 0;
		int max_number = 0;
		int next=0;
		int change=0;
		
		for(int number=0;number<card.length;number++){
			for(int number2=next;number2<card.length;number2++){
				if(max<card[number2]){
					max=card[number2];
					max_number=number2;
				}
			}
			
			change = card[next];
			card[next] = card[max_number];
			card[max_number] = change;
			
			if(next%2==0)
				Alice+=max;
			else
				Bob+=max;
			
			max=0;
			
			next++;
		}
		// 出力
            System.out.println(Alice-Bob);
	}
}
