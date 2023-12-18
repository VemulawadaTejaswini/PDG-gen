import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		ArrayList<Long> num = new ArrayList<>();
		for(long i = 1;i < 2* Math.sqrt((double)N);i++){
			if(N%i==0){
				num.add(i);
			}
		}
		if(num.size() > 2){
			System.out.println(num.get(num.size()-1)+num.get(num.size()-2)-2);
		}else{
			System.out.println(N - 1);
		}
	}
}