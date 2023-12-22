import java.util.*;
public class Main {
	static int henkan(String n){
		return Integer.decode("0x"+n);
	}
	static double dk(String n,String k){
		k=k.substring(1);
		int r = henkan(k.substring(0,2));
		int g = henkan(k.substring(2,4));
		int b = henkan(k.substring(4, 6));
		n=n.substring(1);
		int r2 = henkan(n.substring(0,2));
		int g2 = henkan(n.substring(2,4));
		int b2 = henkan(n.substring(4, 6));
		double result = ((r-r2)*(r-r2)+(g-g2)*(g-g2)+(b-b2)*(b-b2));
		return Math.sqrt(result);
	}
	static String doIt(String n){
		double min = dk(n,hyou[0]);
		int memo=0;
		for(int i=1;i<hyou.length;i++){
			double test = dk(n,hyou[i]);
			if(test<min){
				min=test;
				memo=i;
			}
		}
		return hyou2[memo];
	}
	static String hyou[] = {"#000000","#0000ff","#00ff00","#00ffff","#ff0000","#ff00ff","#ffff00","#ffffff"};
	static String hyou2[] ={"black","blue","lime","aqua","red","fuchsia","yellow","white"};
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String n = in.next();
			if(n=="0")break;
			System.out.println(doIt(n));
		}
	}
}