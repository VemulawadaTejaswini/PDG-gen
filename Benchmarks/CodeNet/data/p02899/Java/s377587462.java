import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	int tmp = sc.nextInt();
        	map.put(tmp, i+1);
        }
		sc.close();
		for (int i = 0; i < n; i++){
			System.out.print(map.get(i+1));
			if(i+1 != n){
				System.out.print(" ");
			}
		}
	}
}