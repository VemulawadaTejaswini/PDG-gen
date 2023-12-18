import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for(int i=0;i<n;i++){
			int x = scanner.nextInt();
			if(x < 3200){
				set.add(x/400);
			}else{
				count++;
			}
		}
		int min = set.size();
		int max = Math.min(set.size()+count, 8);
		System.out.println(min + " " + max);
	}

}
