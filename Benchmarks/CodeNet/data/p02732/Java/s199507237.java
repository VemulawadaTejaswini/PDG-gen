import java.util.*;
import static java.lang.System.*;
import java.math.BigInteger;

import java.io.IOException;
import java.io.InputStream;

public class Main{
  public static void main(String[] args){
	  FastScanner sc = new FastScanner();
	  int N = sc.nextInt();
	  int[] k = new int[N+1];
	  long[] fib = new long[N+1];
	  int[] score = new int[N+1];
	  fib[0] = 0; fib[1] = 1;
	  //long sum = 0;
	  BigInteger sum = new BigInteger("0");
	  
	  for(int i=0; i<N; i++) {
		  int n = sc.nextInt();
		  if(i > 1) fib[i] = fib[i-1] + fib[i-2];
		  score[n]++;
		  k[i + 1] = n;
		  if (score[n] == 2) {
	      BigInteger one = new BigInteger(String.valueOf(1));
		  sum = sum.add(one);
		  } else if (score[n] > 2) {
			  long X = fib[n-1] +(score[n]-1);
			  BigInteger XX = new BigInteger(String.valueOf(X));
			  sum = sum.add(XX);
		  }
	  }
	  
	  //out.println(sum);
	  for(int i=1; i<=N; i++) {
		  //long ans = sum - score[k[i]] + 1;
		  //out.println("scorek:"+(score[k[i]]-1));
		  BigInteger ki = new BigInteger(String.valueOf(score[k[i]] - 1));
		  BigInteger ans = sum.subtract(ki);
		  
		  out.println(ans);
	  }

  }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <= 0){
                return false;
            }
        }
        return true;
    }
    private int readByte(){
        if(hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c){
        return 33 <= c && c <= 126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b <= '9'){
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
}