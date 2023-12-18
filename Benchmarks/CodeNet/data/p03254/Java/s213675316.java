import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
      int N = sc.nextInt();
      int x = sc.nextInt();
      int[] a = new int[N];
      for(int i=0;i<N;i++){
        a[i]=sc.nextInt();
      }
      //ほしい飴少ない順に並べる
      int A;
      for(int j=N-1;j>0;j--){
       for(int i=0;i<j;i++){
        if(a[i]>a[i+1]){
          A=a[i+1];
          a[i+1]=a[i];
          a[i]=A;
        }
       }
      }
      //謙虚な子からあめなくなるまであげる
      int ans=0;
      for(int i=0;i<N;i++){
        x-=a[i];
        if(x>0){//余った
          ans++;
        }else if(x==0){//ぴったり配れた
          ans=i+1;
          break;
        }else if(x<0){//足りない
          ans=i;
          break;
        }
      }
      if(x>0){
       System.out.println(ans-1);
      }else{
        System.out.println(ans);
      }
    }
}