import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		if(1 <= n && n <= 86){
			number = n;
		}
		sn.close();
		int ryuka = calc(number);
		if(ryuka <= Math.pow(10, 18)){
			System.out.println(ryuka);
		}
	}
	
	public static int calc(int number){
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		int ryuka = 0;
		for(int i = 0; i < number-1; i++){
			ryuka = list.get(i) + list.get(i+1);
			list.add(ryuka);
		}
		return ryuka;
	}
}