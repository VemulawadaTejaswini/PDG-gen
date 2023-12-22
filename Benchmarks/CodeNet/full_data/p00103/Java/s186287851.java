import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int aScore = 0;
			int bScore = 0;
			int n = scan.nextInt();
			int score = 0;
			int out = 0;
			boolean fir = false;
			boolean sec = false;
			boolean thi = false;
			String str;
			for(int i = 0;i < n;i++){
				do{
					str = scan.next();
					if(str.equals("OUT")){
						out += 1;
					}else if(str.equals("HIT")){
						if(thi){
							score += 1;
						}
						thi = sec;
						sec = fir;
						fir = true;
					}else if(str.equals("HOMERUN")){
						if(fir){
							score += 1;
							fir = false;
						}
						if(sec){
							score += 1;
							sec = false;
						}
						if(thi){
							score += 1;
							thi = false;
						}
						score += 1;
					}
				}while(out < 3);
				if(i % 2 == 0){
					aScore += score;
				}else{
					bScore += score;
				}
				score = 0;
				fir = false;
				sec = false;
				thi = false;
				out = 0;
			}
			System.out.println(aScore + "\n" + bScore);
		}
	}
}