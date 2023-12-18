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
		int gcnt = 999;
		while(a > 0) {
			while(a > Math.pow(9,nine)) {
				if(a > Math.pow(9,nine + 1)) {
					nine++;
				}else {
					break;
				}
			}
			while(a > Math.pow(6,six)) {
				if(a > Math.pow(6,six + 1)) {
					six++;
				}else {
					break;
				}
			}
			
			//if(36 > a) {
				for(int i = 0;i < 7;i++) {
					for(int k = 0;k < 10;k++) {
						p = a - ((i * 9) + (k * 6));
						if(p >= 0) {
							if(g > (p + i + k)) {
								g = (p + i + k);
								
							}
						}
					}
				}
				if(gcnt > cnt + g) {
					gcnt = cnt + g;
				}
				
			//}
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
		if(gcnt < cnt) {
			System.out.print(gcnt);
		}else {
			System.out.print(cnt);
		}
	}
}