//^¦çê½ñðtÉoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0){
			return ;
		}
		//zñÉi[
		int [] numbers = new int[n];
		for (int i=0 ; i < n ; i++){
			numbers[i] = sc.nextInt();
		}
		//tÉ·é
		int temp;
		for(int i=0; i < n / 2 ; i++){
			temp = numbers[i];
			numbers[i] = numbers[n-i-1];
			numbers[n-i-1] = temp;
		}

		//oÍ·é
		for (int i=0 ; i < n-1 ; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println(numbers[n -1]);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}