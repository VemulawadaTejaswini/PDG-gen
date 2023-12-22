import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int limit;
		while((limit = Integer.parseInt(br.readLine())) != 0){
			List<Integer> primeList = getPrimeNum(limit);
			System.out.println(getMaxTwinPrime(primeList));
		}
	}
	
	private static String getMaxTwinPrime(List<Integer> primeList){
		for(int i = primeList.size() - 1 ; 0 < i ; i--){
			for(int y = i - 1 ; 0 <= y ; y--){
				if(primeList.get(i) - primeList.get(y) == 2){
					return primeList.get(y) + " " + primeList.get(i);
				}else if(primeList.get(i) - primeList.get(y) < 2){
					continue;
				}else{
					break;
				}
			}
		}
		return null;
	} 
	
	private static List<Integer> getPrimeNum(int limit){
		List<Integer> primeList = new ArrayList<>();
		if(limit > 1){
			primeList.add(2);
		}
		for(int i = 3 ; i <= limit ; i += 2){
			boolean primeFlag = true;
			for(int y = 2 ; y < i ; y++){
				if(i % y == 0){
					primeFlag = false;
					break;
				}
			}
			if(primeFlag){
				primeList.add(i);
			}
		}
		return primeList;
	}

}