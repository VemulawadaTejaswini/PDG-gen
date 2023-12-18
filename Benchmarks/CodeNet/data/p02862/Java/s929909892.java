import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int xx = sc.nextInt();
		int yy = sc.nextInt();
		
		int dif;
		int tmp;
		
		long res=0;
		
		if (xx > yy){
			dif = xx - yy;
			xx -= dif * 2;
			yy -= dif;
		}else{
			dif = yy - xx;
			xx -= dif * 2;
			yy -= dif;
		}
		
		tmp = xx/3;
		if (tmp==0){
			System.out.print("0");
			return;
		}
		
		res = 1;
		for (int k=0;k<tmp;k++){
			res = res * (2*tmp+dif-k) / (k+1) ; 
			System.out.println("sum:" + res + "  x:" + (2*tmp+dif-k) );
		}
		System.out.print(res);
		if (res > 10000007){
			res = res % 10000007;
		}
		
		System.out.print(res);
		//System.out.print(factorial((2*tmp+dif),tmp));
		
	}
}