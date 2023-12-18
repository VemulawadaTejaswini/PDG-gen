import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long hh = sc.nextLong();	//縦
		long ww = sc.nextLong();	//横
		long aH = 0;
		long cH = 0;
		long aW = 0;
		long bW = 0;
		long x = 0;
		long H = 0;
		long W = 0;
		long a=0,b=0;
		if( hh<ww ){
			a = hh;
			b = ww;
			hh = b;
			ww = a;          
        }          
		if( ww%3==2 && ww%2!=0 && (hh%3!=2 || hh%2==0) ){
			H = ww;
			W = hh;          
        }else if( ww%3==1 && ww%2!=0 && (hh%3!=2 || hh%2==0) ){
			H = ww;
			W = hh;          
        }else{
			H = hh;
			W = ww;          
        }          
		if( H%3==0 || W%3==0 ){
			x = 0;
		}else{
			if( H%3==1 ){
				aH = H/3;
				cH = H - H/3;
			}
			if( H%3==2 ){
				aH = H/3+1;
				cH = H - (H/3+1);
			}
			if( W%2==0 ){
				aW = W/2;
				bW = W/2;
			}
			if( W%2==1 ){
				aW = W/2+1;
				bW = W - (W/2+1);
			}
		}
		long[] ans = new long[3];
		ans[0]=aH * W;
		ans[1]=cH * aW;
		ans[2]=cH * bW;
		Arrays.sort(ans);
		x = ans[2]-ans[0];
		System.out.println(x);
	}
}
