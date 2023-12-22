import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[N];
      if(k<=N){
        for(int i=0;i<k;i++){
          int[] b=new int[N];
           for(int jj=0;jj<N;jj++){
           b[jj]=0;
           }
          for(int j=0;j<N;j++){
           int d=a[j];
           for(int co=j-d;co<=j+d;co++){
             if(co>=0&&co<N){
               b[co]++;
             }
           }
          }
           for(int ij=0;ij<N;ij++){
          a[ij]=b[ij];
        }
        }
       for(int jj=0;jj<N;jj++){
         System.out.print(a[jj]);
         System.out.print(" ");
       }
      }else{
        for(int jj=0;jj<N;jj++){
         System.out.print(N);
         System.out.print(" ");
       }
      }
}
}