
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int tmp;
		int p = 0;
		int p2 = 0;
		while(scanner.hasNext()){
			tmp = scanner.nextInt();
			if(tmp != 0){
				input.add(p, tmp);
				p++;
			}else{
				ans.add(p2, input.get(p-1));
				p2++;
				p--;
			}
		}
		for(int j=0; j<p2; j++){
			System.out.println(ans.get(j));
		}
	}
}