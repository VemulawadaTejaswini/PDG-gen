import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		boolean iP = false;
		al.add(2);
		al.add(3);
		for(int i = 5; i <= 10000; i += 2){
			for(int j = 2; j * j <= i; j++){
				if(i % j == 0){
					iP = false; break;
				}
				iP = true;
			}
			if(iP) al.add(i);
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 || n > 10000) break;
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum += al.get(i);
			}
			System.out.println(sum);
		}
	}
}