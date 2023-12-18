import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		int nine = 0;
		int six = 0;
		int p = 0;
		int g = 999;
		while(a > 0) {
			while(a > Math.pow(9,nine)) {
				nine++;
			}
			nine--;
			while(a > Math.pow(6,six)) {
				six++;
			}
			six--;
			
			if(36 > a) {
				for(int i = 0;i < 4;i++) {
					for(int k = 0;k < 6;k++) {
						p = a - ((i * 9) + (k * 6));
						if(p >= 0) {
							if(g > (p + i + k)) {
								g = (p + i + k);
							}
						}
					}
				}
				cnt = cnt + g;
				break;
			}
			if(nine != 0 || six != 0) {
				if(Math.pow(9,nine) > Math.pow(6,six)) {
					a = a - (int)Math.pow(9,nine);
				}else {
					a = a - (int)Math.pow(6,six);
				}
				cnt++;
			}else {
				if(a >= 9) {
					a = a - 9;
					cnt++;
				}else if(a >= 6){
					a = a - 6;
					cnt++;
				}else {
					cnt = cnt + a;
					break;
				}
			}
			nine =0;
			six = 0;
		}
		System.out.print(cnt);
	}
}