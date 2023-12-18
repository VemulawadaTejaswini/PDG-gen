import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String a = sc.nextLine();
		
		int[] aList = Stream.of(a.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int sum = 0;
		for(int i : aList) {
			while(true) {
				if(i%2 == 0) {
					i = i/2;
					sum++;
				}
				else
					break;
			}
		}
		System.out.println(sum);
	}
}
