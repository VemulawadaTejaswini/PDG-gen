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
  static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
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
    Runtime rt = Runtime.getRuntime();
    long mae = System.currentTimeMillis();
    solve();
    flush();
    long ato = System.currentTimeMillis();
    myerr("time : " + (ato - mae) + "ms");
    myerr("memory : " + ((rt.totalMemory() - rt.getRuntime().freeMemory()) / 1024) + "KB");
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static void solve(){//ここがメイン関数代わり
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int W = one.get(1);
	HashMap<Long, Long> dp = new HashMap<Long, Long>();
	dp.put(new Long(0), new Long(0));
	ArrayList[] list = new ArrayList[N];
	for(int i = 0; i < N; i++){
		list[i] = nextLongArray();
	}
	for(int i = 0; i < N; i++){
		HashMap<Long, Long> newDP = new HashMap<Long, Long>();
		Iterator it = dp.keySet().iterator();
		
		ArrayList<Long> tmp = list[i];
		long inW = tmp.get(0);
		long inV = tmp.get(1);
		while(it.hasNext()){
			long sumW = (long)it.next();
			newDP.put(sumW, dp.get(sumW));
		}
		it = dp.keySet().iterator();
		while(it.hasNext()){
			long sumW = (long)it.next();
			long max;
			if(dp.containsKey(sumW + inW)){
				long mae = dp.get(sumW + inW);
				long ato = dp.get(sumW) + inV;
				max = Math.max(dp.get(sumW + inW), dp.get(sumW) + inV);
			}else{
				max = dp.get(sumW) + inV;
			}
			
			newDP.put(sumW + inW, max);
		}
		dp = newDP;
	}
	long output = 0;
	Iterator it = dp.keySet().iterator();
	while(it.hasNext()){
		long dpW = (long)it.next();
		if(dpW <= W){
			output = Math.max(dp.get(dpW), output);
		}
	}
	myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
