import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int kazu = 0 ;

		while(scan.hasNext()){
			kazu = scan.nextInt();
			if(kazu != 0){
			num.add(kazu);
			}else{
				System.out.println(num.get(num.size() - 1));
				num.remove(num.size() - 1);

			}
		}

	}

}