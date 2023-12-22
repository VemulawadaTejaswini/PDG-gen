import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		int iningNum = stdIn.nextInt();
		int outCount = 0;
		int score = 0;
		/*
		 * int baseStatus
		 * 
		 * 0=走者なし
		 * 1=1塁走者のみ
		 * 2=2塁走者のみ
		 * 4=3塁走者のみ,
		 * 
		 * 3=1,2塁のみ(1+2)
		 * 5=1,3塁のみ(1+4)
		 * 以下略
		 */
		int baseStatus = 0;
		
		while(0 < iningNum){
			while(outCount < 3){
				String event = stdIn.next();
				if(event.equals("OUT")){
					outCount++;
				}else if(event.equals("HIT")){
					switch(baseStatus){
					case 0:
						baseStatus = 1;
						break;
					case 1:
						baseStatus = 3;
						break;
					case 2:
						baseStatus = 5;
						break;
					case 3:
						baseStatus = 7;
						break;
					case 4:
						baseStatus = 0;
						score++;
						break;
					case 5:
						baseStatus = 3;
						score++;
						break;
					case 6:
						baseStatus = 5;
						score++;
						break;
					case 7:
						score++;
						break;
					}
				}else{
				switch(baseStatus){
					case 0:
						score += 1;
						baseStatus = 0;
						break;
					case 1:
						score += 2;
						baseStatus = 0;
						break;
					case 2:
						score += 2;
						baseStatus = 0;
						break;
					case 3:
						score += 3;
						baseStatus = 0;
						break;
					case 4:
						score += 2;
						baseStatus = 0;
						break;
					case 5:
						score += 3;
						baseStatus = 0;
						break;
					case 6:
						score += 3;
						baseStatus = 0;
						break;
					case 7:
						score += 4;
						baseStatus = 0;
						break;
					}
				}
			}
			iningNum--;
		}
	}
}