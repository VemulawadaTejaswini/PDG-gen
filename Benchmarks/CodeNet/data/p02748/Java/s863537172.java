import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
      int B = scn.nextInt();
      int m = scn.nextInt();
      //冷蔵庫の価格
		int[] a = new int[A];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      //レンジの価格
      int[] b = new int[B];
		for(int i=0; i<b.length; ++i){
			b[i] = scn.nextInt();
		}
      //クーポン格納
      int[] c = new int[m*3];
		for(int i=0; i<c.length; ++i){
			c[i] = scn.nextInt();
		}
      //冷蔵庫の最安値
      int aa = a[0] +1;
      int bb = b[0] +1;
      for(int i=0; i<a.length; ++i){
			if(aa>a[i]){
              aa = a[i];
            }
      }
      //レンジの最安値
      for(int i=0; i<b.length; ++i){
			if(bb>b[i]){
              bb = b[i];
            }
      }
      //合計の最安値
      int ans = aa + bb;
      int sum = 0;
      //クーポン込みの最安値
      for(int i=0; i<c.length; i+=3){
			sum = a[c[i]] + b[c[i+1]] - c[i+2];
        	if(sum < ans){
              ans = sum;
            }
      }
      System.out.println(ans);
	}
}