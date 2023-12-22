import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int A[] = new int[11];
    String name ="";
    int firstIndexAlpha = (int)'a'; // アルファベットの最初の文字
    int sizeAlpha = 26;
    A[0] = (int)(N / Long.valueOf("141167095653376"));
    N = (long)(N % Long.valueOf("141167095653376"));
    A[1] = (int)(N / Long.valueOf("5429503678976"));
    N = (long)(N % Long.valueOf("5429503678976"));//2147483648
    A[2] = (int)(N / Long.valueOf("208827064576"));
    N = (long)(N % Long.valueOf("208827064576"));
    A[3] = (int)(N / Long.valueOf("8031810176"));
    N = (long)(N % Long.valueOf("8031810176"));
    A[4] = (int)(N /308915776);
    N = N %308915776;
    A[5] = (int)N / 11881376;
    N = N % 11881376;
    A[6] = (int)N /456976;
    N = N %456976;
    A[7] = (int)N /17576;
    N = N %17576;
    A[8] = (int)N /676;
    N = N %676;
    A[9] = (int)N /26;
    A[10] = (int)N %26;
    
    for(int a:A) {
      if(a!=0) {
      	name += String.valueOf((char)(firstIndexAlpha + a - 1));
      }
    }
    System.out.println(name);
  }
}