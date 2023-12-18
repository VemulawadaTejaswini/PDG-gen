import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		ArrayList<Integer> water = new ArrayList<>();
		for(int i = 0; i < 40; i++) {
			for(int j = 0; j < 40; j++) {
				if(100*a*i+100*b*j > f) {
					break;
				} else {
					water.add(100*a*i+100*b*j);
				}
			}
		}
		ArrayList<Integer> suger = new ArrayList<>();
		for(int i = 0; i < 3010; i++) {
			for(int j = 0; j < 3010; j++) {
				if(c*i+d*j > f) {
					break;
				} else {
					suger.add(c*i+d*j);
				}
			}
		}//入力終わり
		
		int zentai = 1<<20;
		int suge = 0;
		for(int i = 0; i < water.size(); i++) {
			for(int j = 0; j < suger.size(); j++) {
				if(water.get(i) * e >= suger.get(j)*100 && water.get(i)+suger.get(j)<=f) {
					if(suger.get(j) * zentai > (water.get(i)+suger.get(j))*suge) {
						
						zentai = water.get(i)+suger.get(j);
						suge = suger.get(j);
					}
				}
			}
		}
		if(zentai==1<<20) System.out.println(100*a+" "+0);
		else System.out.println(zentai+" "+suge);
	}
}