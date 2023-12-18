import java.util.*;

class StoneMonument{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int diff = Math.abs(a - b);

		int snowHeight = 0;

		int tower = 0;

		for(int i = 1; i <= diff; i++){
			tower += i;
		}

		snowHeight = tower - b;
		System.out.println(snowHeight);
	}
}
