import java.util.*;import java.io.*;import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static class InputIterator{
    ArrayList<String> inputLine = new ArrayList<String>(1024);
    int index = 0; int max;
    InputIterator(){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String read;
        try{
          read = br.readLine();
        }catch(IOException e){
          read = null;
        }
        if(read != null){
          inputLine.add(read);
        }else{
          break;
        }
      }
      max = inputLine.size();
    }
    boolean hasNext(){return (index < max);}
    String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ");
      }
    }
  }
  
  static InputIterator ii = new InputIterator();//リアクティブでは使えないので諦めてScanner使うこと
  static PrintWriter out = new PrintWriter(System.out);
  static void flush(){out.flush();}
  static void myout(Object t){out.println(t);}
  static void myerr(Object t){System.err.println(t);}
  static String next(){return ii.next();}
  static int nextInt(){return Integer.parseInt(next());}
  static long nextLong(){return Long.parseLong(next());}
  static ArrayList<String> nextStrArray(){return myHanSpSplit(next());}
  static ArrayList<String> myHanSpSplit(String str){return new ArrayList<String>(Arrays.asList(str.split(" ")));}
  static ArrayList<String> nextCharArray(){return mySingleSplit(next());}
  static ArrayList<String> mySingleSplit(String str){return new ArrayList<String>(Arrays.asList(str.split("")));}
  static ArrayList<Integer> nextIntArray(){
    ArrayList<Integer> ret = new ArrayList<Integer>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Integer.parseInt(input.get(i)));
    }
    return ret;
  }
  static ArrayList<Long> nextLongArray(){
    ArrayList<Long> ret = new ArrayList<Long>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Long.parseLong(input.get(i)));
    }
    return ret;
  }
  static String kaigyoToStr(String[] list){return String.join("\n",list);}
  static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
  static String hanSpToStr(String[] list){return String.join(" ",list);}
  static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
  public static void main(String[] args){
    solve();
    flush();
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static void solve(){//ここがメイン関数代わり
    int N = nextInt();
	ArrayList<Long> list = nextLongArray();
	HashMap[] facList = new HashMap[N];
	HashMap<Long,Long> allLcm = new HashMap<Long,Long>();
	final long mod = 1000000007;
	for(int i = 0; i < N; i++){
		HashMap<Long, Long> map = getPrimeFactorization(list.get(i));
		facList[i] = map;
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
          long key = (long)it.next();
			if(!allLcm.containsKey(key)){
				allLcm.put(key,map.get(key));
			}else{
				if((long)allLcm.get(key) < (long)map.get(key)){
					allLcm.put(key,map.get(key));
				}
			}
		}
	}
	long output = 0;
	for(int i = 0; i < N; i++){
		HashMap<Long, Long> map = facList[i];
		Iterator delKeys = map.keySet().iterator();
		HashMap<Long, Long> tmpAllLcm = (HashMap<Long, Long>)allLcm.clone();
        long add = 1;
		while(delKeys.hasNext()){
            long k = (long)delKeys.next();
            long count = tmpAllLcm.get(k);
            count -= map.get(k);
            tmpAllLcm.put(k, count);
		}
        Iterator addKeys = tmpAllLcm.keySet().iterator();
        while(addKeys.hasNext()){
          long k = (long)addKeys.next();
          add *= (long)Math.pow(k, tmpAllLcm.get(k));
	      add %= mod;
        }
		output += add;
		output %= mod;
	}
	myout(output);
  }
  //Method addition frame start
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
  static HashMap<Long,Long> getPrimeFactorization(Long val){
  HashMap<Long,Long> primeList = new HashMap<Long,Long>();
  long div = 2;
  while(val != 1){
    if(val % div == 0){
      if(primeList.get(div) == null){
        primeList.put(div,new Long(1));
      }else{
        primeList.put(div,primeList.get(div) + 1);
      }
      val /= div;
      if(isPrime(val)){
        if(primeList.get(val) == null){
          primeList.put(val,new Long(1));
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
  //Method addition frame end
}
