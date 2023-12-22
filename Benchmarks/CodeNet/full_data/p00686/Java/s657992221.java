import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ns = 1;
			int ew = 0;
			int x = 1;
			int y = 1;
			if(n == 0 && m == 0){
				break;
			}
			while(true){
				String str = sc.next();
				if(str.equals("STOP")){
					System.out.println(x+" "+y);
					break;
				} else if(str.equals("RIGHT")){
					if(ns == 1){
						ns = 0;
						ew = 1;
					} else if(ns == -1){
						ns = 0;
						ew = -1;
					} else if(ew == 1){
						ns = -1;
						ew = 0;
					} else {
						ns = 0;
						ew = 1;
					}
				} else if(str.equals("LEFT")){
					if(ns == 1){
						ns = 0;
						ew = -1;
					} else if(ns == -1){
						ns = 0;
						ew = 1;
					} else if(ew == 1){
						ns = 1;
						ew = 0;
					} else {
						ns = -1;
						ew = 0;
					}
				} else if(str.equals("FORWARD")){
					int d = sc.nextInt();
					if(ns == 0){
						x += ew*d;
					} else {
						y += ns*d;
					}
				} else {
					int di = sc.nextInt();
					if(ns == 0){
						x -= ew*di;
					} else {
						y -= ns*di;
					}
				}
				
				if(x < 1 || x > n || y < 1 || y > m){
					x = n/2;
					if(x == 0) x = 1;
					y = m/2;
					if(y == 0) y = 1;
				} 
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}