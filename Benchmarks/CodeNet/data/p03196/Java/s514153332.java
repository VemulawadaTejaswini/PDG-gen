import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long p = sc.nextLong();
			
			TreeMap<Long, Long> map = primeFactorization(p);
			
			//System.out.println(map);
			
			long ret = 1;
			
			for(Map.Entry<Long, Long> e :map.entrySet()) {
				ret *= Math.pow(e.getKey(),e.getValue()/n );
			}
			
			System.out.println(ret);
			
	    }
		
		
		static TreeMap<Long, Long> primeFactorization (long n) {

			TreeMap<Long, Long> map = new TreeMap<>();
			long sq = (long)Math.sqrt(n);

			//nが素数ならn^1の形で返す
			if (isPrime(n) == true) {
				map.put(n, 1L);
				return map;
			}

			for (long i=2; i<=sq; i++) {
				//n<iなら明らかにnをiで除算できないので終了（ループを余計に回さない）
				if (n < i) break;

				//iが素数なら、nをiで何回除算できるか、その回数をmapに記録する
				if (isPrime(i) == true) {
					long count = 0;
					while (n%i == 0) {
						n /= i;
						count++;
					}
					if (count > 0) {//1回以上割れた場合のみ、mapに記録する
						map.put(i, count);
					}
				}

			}

			//2～sqrt(n)で除算した結果、なお残った数をmapに追加する
			if (n != 1) map.put(n, 1L);

			return map;

		}
		
		static boolean isPrime (long n) {
			if (n==2) return true;
			if (n<2 || n%2==0) return false;
			int d = (int)Math.sqrt(n);
			for (int i=3; i<=d; i+=2) {
				if(n%i==0){return false;}
			}
			return true;
		}
		
	}
	
