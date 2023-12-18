import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int cards[] = new int[Num];
		int a = 0;
		int b = 0;
		for(int n=0;n<Num;n++){
			cards[n] = sc.nextInt();
		}
		Arrays.sort(cards);

		int turn=0;
		for(int n=cards.length-1;n>=0;n--,turn++){
			if(turn%2==0) a += cards[n];
			else  b+= cards[n];
		}
		System.out.println(a-b);
	}
}