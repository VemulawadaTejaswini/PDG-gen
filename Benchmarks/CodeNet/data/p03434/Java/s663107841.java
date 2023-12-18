import java.util.Scanner;
public class B_88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cards = new int[N];
		
		for(int i=0; i<cards.length; i++) 
			cards[i] = sc.nextInt();
		
		int work;
		for(int i= 0 ;i< N; i++) 
			for(int k= i;k< N;k++) 
				if(cards[i] < cards[k])
				{
					work = cards[i];
					cards[i] = cards[k];
					cards[k] = work;
				}
		
		int sum=0;
		for(int i=0; i< N ;i++) 
			if(i % 2 ==0) sum+=cards[i];
			else			  sum-=cards[i];
		
		System.out.println(sum);
	}

}
