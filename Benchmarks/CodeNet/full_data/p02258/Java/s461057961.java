import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxv = -2000000000;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0;i<N;i++){
			numbers.add(sc.nextInt());
		}
		for(int i =1;i<N;i++){
			for(int j=0;j<i-1;j++){
				if(maxv<numbers.get(i)-numbers.get(j)){
					maxv =numbers.get(i)-numbers.get(j);
				}
			}
		}
        System.out.println(maxv);

	}

}

