import java.util.Scanner;

public class Main {
	static int meiji = era(1868,9,8),
			taisho = era(1912,7,30),
			showa = era(1926,12,25),
			heisei = era(1989,1,8);
	static int era(int y, int m, int d ){
		return y*10000 + m*100 + d;
	}
	static String ans(int temp ,int y , int m ,int d){
		y++;
		if( meiji <=temp &&temp < taisho)return "meiji "+ String.valueOf(y - 1868)+" " + m +"  "+ d;
		else if(taisho <= temp&&temp < showa)return "taisho "+ String.valueOf(y - 1912)+" " + m +"  "+ d;
		else if(showa <= temp&&temp < heisei)return "show " + String.valueOf(y - 1926)+" " + m +"  "+ d;
		else if (temp >= heisei)return "heisei " + String.valueOf(y - 1989)+" " + m +"  "+ d;
		else return "pre-meiji";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext()){
			int 
			 y = sc.nextInt(),
			 m = sc.nextInt(),
			 d = sc.nextInt();
			System.out.println(ans(era(y,m,d),y,m,d));
		}
		
	}
}