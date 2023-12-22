import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main{
    static PrintWriter out=new PrintWriter(System.out);
    static FastScanner sc=new FastScanner();
    static Scanner stdIn=new Scanner(System.in)
    public static void main(String[] args){
      int n=sc.nextInt();
      Data[] d1=new Data[n];
      Data[] d2=new Data[n];
      for(int i=0;i<n;i++){
        char[] in=sc.next().toCharArray();
        d1[i]=new Data(p(in),i,in);
        d2[i]=new Data(p(in),i,in);
      }
      bubbleSort(d1,n);
      selectionSort(d2,n);

      System.out.print(String.valueOf(d1[0].data));
      for(int i=1;i<n;i++){
        System.out.print(" "+String.valueOf(d1[i].data));
      }
      System.out.println();
      System.out.println((isStable(d1)?"Stable":"Not stable"));

      System.out.print(String.valueOf(d2[0].data));
      for(int i=1;i<n;i++){
        System.out.print(" "+sTRING.ValueOf(d2[i].data));
      }
      System.out.println();
      System.out.println((isStable(d2)?"Stable":"Not stable"));
    }

    static boolean isStable(Data[] c){
      int n=c.length;
      for(int i=0;i<n-1;i++){
        if(c[i].value==c[i+1].value){
          if(c[i].id>=c[i+1].id) return false;
        }
      }
      return true;
    }
    static int p(char[] in){
      return (in[1]-'1');
    }
    static void bubbleSort(Data[] C,int N){
      for(int i=0;i<N;i++){
        for(int j=N-1;j>i;j--){
          if(C[j].value<C[j-1].value){
            swap(j,j-1,C);
          }
        }
      }
    }

    static void selectionSort(Data[] C,int N){
      for(int i=0;i<N;i++){
        int minj=i;
        for(int j=i;j<N;j++){
          if(C[j].value<C[minj].value){
            minj=j;
          }
        }
        swap(i,minj,C);
      }
    }

    static void swap(int a,int b,Data[] C){
      Data tmp=c[a];
      c[a]=c[b];
      c[b]=tmp;
    }
    static class Data{
      int value;
      int id;
      char[] data;
      Data(int value,int id,char[] data){
        this.value=value;
        this.id=id;
        this.data=data;
      }
    }
}

class FastScanner{
  private final InputStream in=System.in;
  private final byte[] buffer=new byte[1024];
  private int ptr=0;
  private int buflen=0;
  private boolean hasNextByte(){
    if(ptr<buflen){
      return true;
    }else{
      ptr=0;
      try{
        buflen=in.read(buffer);
      }catch(IOException e){
        e.printStackTrace();
      }
      if(buflen<=0){
        return false;
      }
    }
    return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
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
     
    public int nextInt() {
         if (!hasNext()) throw new NoSuchElementException();
         int n = 0;
         boolean minus = false;
         int b = readByte();
         if (b == '-') {
             minus = true;
             b = readByte();
         }
         if (b < '0' || '9' < b) {
             throw new NumberFormatException();
         }
         while(true){
             if ('0' <= b && b <= '9') {
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
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
