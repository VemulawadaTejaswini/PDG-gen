
import java.util.Scanner;

public class Main {

	static int[][] color = 
	{
	{0,0,0},
	{0,0,255},
	{0,255,0},
	{0,255,255},
	{255,0,0},
	{255,0,255},
	{255,255,0},
	{255,255,255},
	};
	static String anss[] =
	{ "black","blue","lime","aqua","red","fuchsia","yellow","white"};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			String str = cin.next();
			if(str.equals("0")){
				break;
			}
			int r = hex(str.substring(1,3));
			int g = hex(str.substring(3,5));
			int b = hex(str.substring(5,7));
//			System.out.println(r+" " +g+" " +b);
			double min = 9999999999.0;int ans=0;
			for(int i = 0;i<8;i++){
				double a = 0;
				a = d(r,g,b,i);
				if(min > a){
					min = a;
					ans = i;
				}
			}
			System.out.println(anss[ans]);
		}
	}
	static double d(int r, int g, int b ,int x){
		double re = Math.pow(r-color[x][0],2);
		re += Math.pow(g-color[x][1],2);
		re += Math.pow(b-color[x][2],2);
		re = Math.sqrt(re);
		return re;
	}
	static int hex(String str){
		char[] s = str.toCharArray();
		int re = 0;
		if(Character.isDigit(s[0])){
			re += (s[0]-'0')*16;
		}
		else{
			re += (s[0]-'a' + 10)*16;
		}
		if(Character.isDigit(s[1])){
			re += (s[1]-'0');
		}
		else{
			re += (s[1]-'a' + 10);
		}
		return re;
	}
}