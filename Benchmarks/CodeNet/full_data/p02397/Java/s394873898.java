import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		int x = 0;
		int y = 0;
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			if(y < x){
				int temp = y;
				y = x;
				x = temp;
			}
			list.add(String.valueOf(x) + ' ' + String.valueOf(y));
		}
		for(String data: list){
			System.out.println(data);
		}
	}
}


