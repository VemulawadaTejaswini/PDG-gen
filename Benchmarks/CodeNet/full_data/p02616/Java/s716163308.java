import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    int count = 0;
    long ans = 1;
    int minpos = 0;
    int maxpos = n-1;
    boolean minus = false;
    boolean allminus = true;
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
      if( a[i] > -1 ){
        allminus = false;
      }
    }
    Arrays.sort(a);
    while(true){
      if( minus && count < k ){
        ans = ans * a[minpos] % (long)( 1000000000 + 7 );
        minpos++;
        count++;
        minus = false;
        //System.out.println("１こめ:"+count);
      }else if( maxpos > -1 && minpos < n && Math.abs(a[maxpos]) < Math.abs(a[minpos]) 
               && minpos + 1 < n && a[minpos] < 0 && count + 1 < k  ){
        ans = ans * a[minpos] % (long)( 1000000000 + 7 );
        minpos++;
        minus = true;
        count++;
        //System.out.println("2こめ:"+count);
      }else{
        ans = ans * a[maxpos] % (long)( 1000000000 + 7 );
        maxpos--;
        count++;
        //System.out.println("3こめ:"+count);
      }
      if( count+1 > k ){
        break;
      }     
    }
    if(allminus&&k%2==1){
      ans = 1;
      for(int i=0;i<k;i++){
        ans = (ans *  a[n-1-i] + (long)1000000007)% (long)( 1000000000 + 7 );
      }
    }
    System.out.println(ans);
  }
}