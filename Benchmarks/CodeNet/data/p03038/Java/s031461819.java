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
    myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static void solve(){//ここがメイン関数代わり
	ArrayList<Integer> one = nextIntArray();
	int N = one.get(0);
	int M = one.get(1);
	ArrayList<Integer> list = nextIntArray();
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	for(int i = 0; i < N; i++){
		if(!map.containsKey(list.get(i))){
			map.put(list.get(i), 0);
		}
		map.put(list.get(i), map.get(list.get(i)) + 1);
	}
	for(int i = 0; i < M; i++){
		ArrayList<Integer> tmp = nextIntArray();
		int B = tmp.get(0);
		int C = tmp.get(1);
		while(B > 0){
			int minKey = map.firstKey();
			if(minKey < C){
				if(!map.containsKey(C)){
					map.put(C, 0);
				}
				map.put(C, map.get(C) + Math.min(map.get(minKey), B));
				if(map.get(minKey) <= B){
					B -= map.get(minKey);
					map.pollFirstEntry();
				}else{
					map.put(minKey, map.get(minKey) - B);
					B = 0;
				}
			}else{
				break;
			}
		}
	}
	long output = 0;
	Iterator it = map.keySet().iterator();
	while(it.hasNext()){
		int key = (int)it.next();
		output += (long)key * map.get(key);
	}
	myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
