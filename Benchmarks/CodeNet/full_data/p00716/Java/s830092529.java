import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		

		int m = sc.nextInt();
		for(int i = 0; i < m; i++){
			int shikin = sc.nextInt();
			int nensuu = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Integer> houhou = new ArrayList<Integer>();
			ArrayList<Double> nenri = new ArrayList<Double>();
			ArrayList<Integer> tesuu = new ArrayList<Integer>();
			for(int j = 0; j < n; j++){
				houhou.add(j, sc.nextInt());
				nenri.add(j, sc.nextDouble());
				tesuu.add(j, sc.nextInt());
			}
			calc(shikin, nensuu, n, houhou, nenri, tesuu);
		}
	}
	public void calc(int shikin, int nensuu, int n, ArrayList<Integer> houhou, ArrayList<Double> nenri, ArrayList<Integer> tesuu){
		int finalshikin = 0;
		for(int i = 0; i < n; i++){
			int h = houhou.get(i);
			int a = 0;
			if(h == 0){
				a = shikin;
				int rishi = 0;
				for(int j = 0; j < nensuu; j++){
					int b = (int) (a * nenri.get(i));
					a = a - tesuu.get(i);
					rishi = rishi + b;
				}
				a = a + rishi;
			}
			else if(h == 1){
				a = shikin;
				for(int j = 0; j < nensuu; j++){
					int b = (int) (a * nenri.get(i));
					a = a + b - tesuu.get(i);
				}
			}
			if(a >= finalshikin){
				finalshikin = a;
			}
		}
		System.out.println(finalshikin);
	}
	public static void main(String[] args){
		new Main().run();
	}
}