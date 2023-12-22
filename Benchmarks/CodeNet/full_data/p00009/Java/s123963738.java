import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			//以下、エラトステネスの篩もどき
			int n = stdIn.nextInt();
			int primeNumber = 0;
			ArrayList<Integer> searchList = new ArrayList<Integer>();	//探索リスト
			ArrayList<Integer> primeList = new ArrayList<Integer>();	//素数リスト

			if(2 <= n){
				primeList.add(2);
			}
			for(int i = 3;i <= n; i += 2){
				searchList.add(i);
			}

			if(!searchList.isEmpty()){
				int primeListMaxNumSquare = primeList.get(primeList.size()-1);
				primeListMaxNumSquare *= primeListMaxNumSquare;
				while(searchList.get(searchList.size()-1) >= primeListMaxNumSquare){
					int temp = searchList.get(0);
					searchList.remove(0);
					primeList.add(searchList.get(0));
					ArrayList<Integer> tempList = new ArrayList<Integer>();
					for(int i = searchList.size() - 1; i >= 0 ; i--){
						if(searchList.get(i) % temp == 0){
							tempList.add(i);
						}
					}
					for(int x:tempList){
						searchList.remove(x);
					}
					primeListMaxNumSquare = primeList.get(primeList.size()-1);
					primeListMaxNumSquare *= primeListMaxNumSquare;
				}
			}
			primeNumber = searchList.size() + primeList.size();
			System.out.println(primeNumber);
		}
	}
}