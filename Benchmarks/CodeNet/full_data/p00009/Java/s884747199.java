import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			ArrayList<Integer> primeList = new ArrayList<Integer>();
			boolean primeFlag = true;
			if(n >= 2){
				for(int i = 3;i <= n; i+=2){
					for(int j:primeList){
						if(i % j == 0){
							primeFlag = false;
							break;
						}
					}
					if(primeFlag){
						primeList.add(i);
					}else{
						primeFlag = true;
					}
				}
				primeList.add(2);
			}
			int primeNumber;
			if(primeList.isEmpty()){
				primeNumber = 0;
			}else{
				primeNumber = primeList.size();
			}
			System.out.println(primeNumber);
		}
	}
}