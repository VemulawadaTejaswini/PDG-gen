import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int t = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			
			if(t == -1 && m == -1 && s == -1){
				break;
			}
			
			int ot = 1 - t;
			int om = 59 - m;
			int os = 60 - s;
			if(os == 60){
				om++;
				os = 0;
			}
			if(om == 60){
				ot++;
				om = 0;
			}
			String stt = "0" + Integer.toString(ot);
			String stm = Integer.toString(om);
			if(stm.length() == 1){
				stm = "0" + stm;
			}
			String sts = Integer.toString(os);
			if(sts.length() == 1){
				sts = "0" + sts;
			}
			
			System.out.println(stt + ":" + stm + ":" + sts);
			
			int tm = t*3600 + m * 60 + s;
			tm /= 3;
			
			t = tm/3600;
			tm = tm%3600;
			m = tm/60;
			s = tm%60;
			
			ot = 1 - t;
			om = 59 - m;
			os = 60 - s;
			if(os == 60){
				om++;
				os = 0;
			}
			if(om == 60){
				ot++;
				om = 0;
			}
			stt = "0" + Integer.toString(ot);
			stm = Integer.toString(om);
			if(stm.length() == 1){
				stm = "0" + stm;
			}
			sts = Integer.toString(os);
			if(sts.length() == 1){
				sts = "0" + sts;
			}
			
			System.out.println(stt + ":" + stm + ":" + sts);

		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}