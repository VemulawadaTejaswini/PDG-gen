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
    ArrayList<Integer> aList = nextIntArray();
    ArrayList<Integer> bList = nextIntArray();
    PriorityQueue<Integer[]> pq = new PriorityQueue<Integer[]>(new originComparator());
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i = 0; i < N; i++){
      int mae = i - 1;
      if(mae == -1){
        mae = N - 1;
      }
      int ato = i + 1;
      if(ato == N){
        ato = 0;
      }
      if(bList.get(i) > bList.get(mae) + bList.get(ato)){
        Integer[] tmp = new Integer[2];
        tmp[0] = bList.get(i);
        tmp[1] = i;
        pq.add(tmp);
      }
    }
    int output = 0;
    //操作を逆順で見る。値が大きいやつから見る
    //pqからとれた最大値%(その前後ふたつを足したもの)=bList[取れた場所]更新
    //Math.floor(pqからとれた最大値/(その前後ふたつを足したもの))=操作回数
    try{
    while(pq.size() != 0){
      Integer[] tmp = pq.poll();
      int max = tmp[0];
      int index = tmp[1];
      int mae = index - 1;
      if(mae == -1){
        mae = N - 1;
      }
      int ato = index + 1;
      if(ato == N){
        ato = 0;
      }
      int bMae = bList.get(mae);
      int bAto = bList.get(ato);
      output += max / (bMae+bAto);
      max = max % (bMae + bAto);
      bList.set(index, max);
      
      int maemae = mae - 1;
      if(maemae == -1){
        maemae = N - 1;
      }
      if(bMae > bList.get(maemae) + bList.get(index)){
        Integer[] addMae = new Integer[2];
        addMae[0] = bMae;
        addMae[1] = mae;
        pq.add(addMae);
      }
      int atoato = ato + 1;
      if(atoato == N){
        atoato = 0;
      }
      if(bAto > bList.get(atoato) + bList.get(index)){
        Integer[] addAto = new Integer[2];
        addAto[0] = bAto;
        addAto[1] = ato;
        pq.add(addAto);
      }
    }
    }catch(Exception e){
      myout(-1);
      return;
    }
    boolean isAllOK = true;
    for(int i = 0; i < N; i++){
      if(aList.get(i) != bList.get(i)){
        isAllOK = false;
      }
    }
    if(isAllOK){
      myout(output);
    }else{
      myout(-1);
    }
    
  }
  //Method addition frame start
public static class originComparator implements Comparator<Integer[]>{
        public int compare(Integer[] mae, Integer[] ato){
                return ato[0] - mae[0];
        }
}
  //Method addition frame end
}
