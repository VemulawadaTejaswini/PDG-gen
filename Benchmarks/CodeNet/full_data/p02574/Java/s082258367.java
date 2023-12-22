import java.util.*;
public class Main {
  	public static int[] count = new int[1000001];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      	boolean flag = true;
      	for(int i=n-1;i>-1;i--){
          if( !cc(a[i]) ){
            flag = false;
          }
          if( !flag ){
            break;
          }
        }
      	for(int i=0;i<count.length;i++){
          if( count[i] > 0 ){
            flag = false;
            break;
          }
        }
      	if( flag ){
          System.out.println("pairwise coprime");
        }else{
          int p = ff(a[0],a[1]);
          flag = true;
          if( p != -1 ){
            flag = false;
            for(int i=2;i<n;i++){
              if( a[i] % p != 0 ){
                flag = true;
                break;
              }
            }
          }
          if( flag ){
            System.out.println("setwise coprime");
          }else{
            System.out.println("not coprime");
          }
          
        }
	}
  	public static int ff(int a,int b){
      int tmp = -1;
      for(int i=2;(i<a+1)&&(i<b+1);i++){
        if( (a % i == 0)&& (b%i == 0) ){
          tmp = i;
        }
      }
      return tmp;
    }
  
  	public static boolean cc(int n){
      for(int i=2;i<n-1;i++){
        if( n % i == 0 ){
          count[i]++;
        }
        if( count[i] > 1 ){
          return false;
        }
        if( i*i > n ){
          i = n - 1;
        }
      }
      return true;
    }
}