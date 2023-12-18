import java.util.*;
import java.io.*;
public class Main {
        static public class InputIterator{
          ArrayList<String> inputLine = new ArrayList<String>(1024);
          int index = 0;
          int max;
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
        
        static InputIterator ii = new InputIterator(); 
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String next(){return ii.next();}
        static int nextInt(){return Integer.parseInt(next());}
        static long nextLong(){return Long.parseLong(next());}
        static String[] nextStrArray(){return next().split(" ");}
        static ArrayList<Integer> nextIntArray(){
          ArrayList<Integer> ret = new ArrayList<Integer>();
          String[] input = nextStrArray();
          for(int i = 0; i < input.length; i++){
            ret.add(Integer.parseInt(input[i]));
          }
          return ret;
        }
        static ArrayList<Long> nextLongArray(){
          ArrayList<Long> ret = new ArrayList<Long>();
          String[] input = nextStrArray();
          for(int i = 0; i < input.length; i++){
            ret.add(Long.parseLong(input[i]));
          }
          return ret;
        }
        static char[] nextCharArray(){return mySplit(next());}
        static char[] mySplit(String str){return str.toCharArray();}
        static String kaigyoToStr(String[] list){return String.join("\n",list);}
        static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
        static String hanSpToStr(String[] list){return String.join(" ",list);}
        static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
        public static void main(String[] args){
          int N = nextInt();
          ArrayList<Integer> list = nextIntArray();
          final long mod = 998244353;
          if(list.get(0) != 0){
            myout(-1);
            return;
          }
          long output = 1;
          long[] count = new long[N];
          Arrays.fill(count,0);
          for(int i = 0; i < N; i++){
            count[list.get(i)]++;
          }
          if(count[0] != 1){
            myout(-1);
            return;
          }
          for(int i = 0; i < N - 1; i++){
            output = (output * originPow(count[i],count[i + 1],mod)) % mod;
          }
          myout(output);
        }
        //Method addition frame start
static long originPow(long x, long n) {return originPow(x,n,-1);}
static long originPow(long x, long n, long m) {
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
        //Method addition frame end
}
