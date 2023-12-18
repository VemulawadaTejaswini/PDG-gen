import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int A = s.nextInt();
	static int B = s.nextInt();
	static int C = s.nextInt();
	static int D = s.nextInt();
	static double E = s.nextInt();
	static double F = s.nextInt();
	static int maxsatou = 0;
	static int maxsatousui = 0;
	static double maxnoud = 0;


	public static void main(String[] args){
		solve();
	}

	static void solve() {
		
		for(int i= 0;100*A*i<=F;i++){
			for(int j = 0;100*B*j<=F;j++){
				if(j == 0&&i ==0)j =1;
				
				water((100*A*j)+(100*B*i));
			
			}
		}
		System.out.println(maxsatousui);
		System.out.println((int)maxsatou);
		

		
	}
static void water(double water){
	for(int i= 0;C*i <=F-water;i++){
		for(int j = 0;D*j <=F-water;j++){
			
			
			dps(water, (C*j)+(D*i));
		}
	}
}
	
	
	

	static void dps(double water,double satou){
		if((water+satou <=F) && (100*satou/(water+satou) <= 100*E/(100+E)) && (100*satou/(water+satou) >maxnoud)){
			maxsatou = (int)satou;
			maxsatousui =(int) (satou + water);
			maxnoud = (100*satou/(water+satou));
			
		}else {
			return;
		}

	}

}


