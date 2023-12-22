import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w == 0)break;
			calc(h, w);
		}
	}
	public void calc(int h, int w){
		int now = h*h + w*w;
		int ans = Integer.MAX_VALUE;
		int ans_w = Integer.MAX_VALUE;
		int ans_h = Integer.MAX_VALUE;
		
		for(int i = 1; i < 200; i++){
			for(int j = 1; j < i; j++){
				int a = i*i + j*j;
				if(now == ans){
					if(a==now && h<j && j<ans_h){
						ans = a;
						ans_w = i;
						ans_h = j;
					}
				}
				else if ((now<a && a<ans)
						|| (now==a && j>h)
						|| (ans==a && j<ans_h)){
					ans = a;
					ans_w = i;
					ans_h = j;
				}
				if(a > ans) break;
			}
			if(i*i > ans) break;
		}
		System.out.println(ans_h + " " + ans_w);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}