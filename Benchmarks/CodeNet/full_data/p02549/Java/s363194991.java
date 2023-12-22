import java.util.*;
public class Main {
  	public static long[][] num = new long[3000][3000];
  	public static long[][] tmp = new long[3000][3000];
  	public static long INF = 998244353;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] x = new int[k];
      	int[] y = new int[k];
      	int count = 0;
      	for(int i=0;i<k;i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
          count += ( y[i] - x[i] + 1 );
        }
      	int[] s = new int[count];

      	int pos = 0;      
      	for(int i=0;i<k;i++){
          for(int j=x[i];j<=y[i];j++){
            s[pos] = j;
            pos++;
          }
        }
      
      	addNum(1,1);
      	//
      	for(int i=1;i<n+1;i++){
          for(int j=0;j<s.length;j++){
            if( i + s[j] < 200001 ){
              addNum( i+s[j] , getNum(i) );
              //System.out.println( i+s[j] +":"+ getNum(i+s[j]) );
            }
          }
        }
      	//
      	System.out.println( getNum(n) );
	}
  	public static int[] trans(int pos){
      int[] a = new int[2];
      a[0] = pos / 3000;
      a[1] = pos % 3000;
      return a;
    }
  	public static void addNum(int pos,long n){
      int[] a = trans(pos);
      //num[a[0]][a[1]] += n;
      num[a[0]][a[1]] = ( num[a[0]][a[1]] + n ) % INF;
    }
  	public static long getNum(int pos){
      int[] a = trans(pos);
      return num[a[0]][a[1]];
    }
    public static void addTmp(int pos,long n){
      int[] a = trans(pos);
      tmp[a[0]][a[1]] += n;
    }
  	public static long getTmp(int pos){
      int[] a = trans(pos);
      return tmp[a[0]][a[1]];
    }
}