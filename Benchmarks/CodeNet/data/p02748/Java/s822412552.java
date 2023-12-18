import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
      int B = scn.nextInt();
      int m = scn.nextInt();
		int[] a = new int[A];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      int[] b = new int[B];
		for(int i=0; i<b.length; ++i){
			b[i] = scn.nextInt();
		}
      int[] c = new int[m*3];
		for(int i=0; i<c.length; ++i){
			c[i] = scn.nextInt();
		}
      int aa = a[0] +1;
      int bb = b[0] +1;
      for(int i=0; i<a.length; ++i){
			if(aa>a[i]){
              aa = a[i];
            }
      }
      for(int i=0; i<b.length; ++i){
			if(bb>b[i]){
              bb = b[i];
            }
      }
      int ans = aa + bb;
      int sum = 0;
      int ca = 0;
      int cb = 0;
      for(int i=0; i<c.length; i+=3){
        ca = c[i];
        cb = c[i+1];
			sum = a[ca] + b[cb] - c[i+2];
        	if(sum<ans){
              ans = sum;
            }
      }
      System.out.println(ans);
	}
}
//一旦保存
