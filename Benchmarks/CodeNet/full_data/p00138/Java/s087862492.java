import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Result [] resultArray = new Result[24];
		for(int i = 0; i < 24; i++) {
			int n = sc.nextInt();
			String str = sc.next(); 
			resultArray[i] = new Result(n, str);
		}
		Arrays.sort(resultArray, 0, 8);
		Arrays.sort(resultArray, 8, 16);
		Arrays.sort(resultArray, 16, 24);
		for(int i = 0; i < 3; i++) {
			System.out.println(resultArray[i * 8].num + " " + resultArray[i * 8].time);
			System.out.println(resultArray[i * 8 + 1].num + " " + resultArray[i * 8 + 1].time);
			resultArray[i * 8].time = "aaaa";
			resultArray[i * 8 + 1].time = "aaaa";
		}
		Arrays.sort(resultArray);
		System.out.println(resultArray[0].num + " " + resultArray[0].time);
		System.out.println(resultArray[1].num + " " + resultArray[1].time);
	}
	
}
class Result implements Comparable<Result> {
	int num;
	String time;
	Result(int num, String time) {
		this.num = num;
		this.time = time;
	}
	@Override
	public int compareTo(Result r) {
		return time.compareTo(r.time);
	}
}	