import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
		ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int M = one.get(1);
      int mod = 1000000007;
      Combination comb = new Combination(200000, mod);
      TreeMap<Integer, Integer> map = getPrimeFactorization(M);
      long output = 1;
      Iterator<Integer> keys = map.keySet().iterator();
      while(keys.hasNext()){
        int p = keys.next();
        output *= comb.nCk(map.get(p) + N - 1, map.get(p), mod);
        output %= mod;
      }
      myout(output);
	}
	//Method addition frame start

static class Combination{
        long[] kaijo;
        long[] inverse;
        Combination(int N, long mod){
                kaijo = new long[N + 1];
                inverse = new long[N + 1];
                kaijo[0] = 1;
                inverse[0] = 1;
                for(int i = 1; i <= N; i++){
                        kaijo[i] = kaijo[i - 1] * (long)i % mod;
                        inverse[i] = inverse[i - 1] * this.pow((long)i, mod - 2, mod) % mod;
                }
        }
        private long pow(long x, long n, long m) {
                long ans = 1;
                while (n > 0) {
                        if ((n & 1) == 1){
                          ans = ans * x;
                          if(m != -1){ans %= m;}
                        }
                        x = x * x;
                        if(m != -1){x %= m;}
                        n >>= 1;
                }
                return ans;
        }
        public long nCk(int n, int k, long mod){
                if(k < 0 || k > n){
                        return 0;
                }
                return ((kaijo[n] * inverse[k]) % mod * inverse[n - k]) % mod;
        }
}
  
static TreeMap<Integer,Integer> getPrimeFactorization(int val){
  TreeMap<Integer,Integer> primeList = new TreeMap<>();
  if(isPrime(val)){
          primeList.put(val, 1);
          return primeList;
  }
  int div = 2;
  while(val != 1){
    if(val % div == 0){
      int count = 2;
      while(val % (long)Math.pow(div, count) == 0){
        count++;
      }
      if(primeList.get(div) == null){
        primeList.put(div, count - 1);
      }else{
        primeList.put(div, primeList.get(div) + (count - 1));
      }
      val /= (long)Math.pow(div, count - 1);
      if(isPrime(val)){
        if(primeList.get(val) == null){
          primeList.put(val,1);
        }else{
          primeList.put(val,primeList.get(val) + 1);
        }
        break;
      }
    }else{
      div = (div == 2) ? div + 1 : div + 2;
    }
  }
  return primeList;
}
  
  static boolean isPrime(long val){
        if(val <= 1 || (val != 2 && val % 2 == 0)){
                return false;
        }else if(val == 2){
                return true;
        }
        double root = Math.floor(Math.sqrt(val));
        for(long i = 3; i <= root; i += 2){
                if(val % i == 0){
                        return false;
                }
        }
        return true;
}

	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
