
import java.util.*;
public class Main {

	private int intPow(int a, int b){
		if(b == 0){
			return 1;
		}
		int sum = a;
		for(int i=1; i < b; i++){
			sum *= a;
		}
		return sum;
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; (n >> i) > 0; i++){

				if(((n >> i ) & 1) == 1){
					list.add(intPow(2, i));
				}
			}
			System.out.print(list.get(0));
			for(int i=1; i < list.size(); i++){
				System.out.print(" " + list.get(i));
			}
			System.out.println("");

		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}