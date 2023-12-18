import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static int N;
	static int[] monsters;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 monsters = new int[N];
		 Queue<Integer> monstersq = new ArrayDeque<>();


		 for(int i = 0 ; i < N ; i++){
			 monsters[i] = sc.nextInt();
		 }

		 sc.close();
		 Arrays.sort(monsters);

		 for(int i = 0 ; i < N ; i++){
			 monstersq.add(monsters[i]);
		 }
		 monstersq.add(2000000000);

		 int min = monstersq.poll();
		 int battle = monstersq.poll();
		 for(int k = 0 ; k < N ; k++){

			 if(battle == 2000000000){
				 System.out.println(min);
				 break;
			 }
			 int result = battlegame(battle,min);

			 if(result == 1){
				 battle = monstersq.poll();
				continue;
			 }else{
				 int temp = battle%min;
				 battle = min;
				 min = temp;
				 if(min == 1){
					 System.out.println(min);
					 break;
				 }
				 else{
					 continue;
				 }
			 }
		 }
	}

	static int battlegame(int a,int b){
		int p = 0;

		if(a%b==0){
			p = 1;
		}else{
			p = 2;
		}
		return p;
	}
}