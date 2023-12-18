import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static public class InputIterator{
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
    public boolean hasNext(){return (index < max);}
    public String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ。");
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
  static public void solve(){//ここがメイン関数代わり
    int N = nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayDeque<Integer> maeQueue = new ArrayDeque<Integer>();
    long output = 0;
    for(int i = 0; i < N; i++){
      list.add(nextInt());
    }
    Collections.sort(list);
    for(int i = 0; i < N; i++){
      maeQueue.addLast(list.get(i));
    }
    ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
  queue.addLast(maeQueue.pollFirst());
  while(maeQueue.size() > 0){
    int useMae = queue.peekFirst();
    int useAto = queue.peekLast();
    int inMae = maeQueue.peekFirst();
    int inAto = maeQueue.peekLast();
    if(useMae == useAto && inMae == inAto){
      queue.addLast(maeQueue.pollLast());
    }else if(useMae == useAto){
      if(Math.abs(useMae - inMae) >= Math.abs(useMae - inAto)){
        queue.addLast(maeQueue.pollFirst());
      }else{
        queue.addLast(maeQueue.pollLast());
      }
    }else if(inMae == inAto){
      if(Math.abs(useMae - inMae) >= Math.abs(useAto - inMae)){
        queue.addFirst(maeQueue.pollFirst());
      }else{
        queue.addLast(maeQueue.pollFirst());
      }
    }else{
      int res1 = Math.abs(inMae - useMae);
      int res2 = Math.abs(inMae - useAto);
      int res3 = Math.abs(inAto - useMae);
      int res4 = Math.abs(inAto - useAto);
      if(res1 >= res2 && res1 >= res3 && res1 >= res4){
        queue.addFirst(maeQueue.pollLast());
        continue;
      }
      if(res2 >= res1 && res2 >= res3 && res2 >= res4){
        queue.addLast(maeQueue.pollFirst());
        continue;
      }
      if(res3 >= res1 && res3 >= res2 && res3 >= res4){
        queue.addFirst(maeQueue.pollLast());
        continue;
      }
      if(res4 >= res1 && res4 >= res2 && res4 >= res3){
        queue.addLast(maeQueue.pollLast());
      }
    }
  }
  
  int mae = queue.pollFirst();
    while(queue.size() > 0){
      int ato = queue.pollFirst();
      output += Math.abs(mae - ato);
      mae = ato;
    }
  
  myout(output);
  }
  //Method addition frame start

  //Method addition frame end
}
