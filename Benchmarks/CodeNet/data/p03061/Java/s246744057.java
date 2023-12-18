import java.util.*;
public class Main {
  static int gcd( int a , int b ){
    return b>0?gcd(b,a%b):a;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] num;
    num = new int[N];
    for ( int i = 0 ; i < N ; i++ ){
      num[i] = sc.nextInt();
    }
    
    int[] GCDs;
    GCDs = new int[N];
    
    for (int i = 0 ; i < N ; i++){
      int GCD = num[0];
      for ( int k = 0 ; k < N ; k++ ){
        if ( i==k ){continue;}
        GCD = gcd ( num[k] , GCD );
      }
      GCDs[i] =GCD;
    }

    int max = 0;
    for(int i = 0; i < GCDs.length ; i++) {
        if(max < GCDs[i]) {
            max = GCDs[i];
        }
    }
    System.out.println(max);
  }
}