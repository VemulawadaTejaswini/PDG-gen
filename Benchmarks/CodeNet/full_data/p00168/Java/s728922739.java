import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while( n != 0){
			int [] list = new int[30+1];
			list[0] = 1;
			for(int i=0; i <= 30; i++){
				for(int j =1; j <= 3; j++){
					if(i - j >= 0){
						list[i] += list[i-j];
					}
				}
			}
			int result = list[n];
			result = result / 10;
			result = result / 365 + 1;
			System.out.println(result);
			n = sc.nextInt();
		}
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}