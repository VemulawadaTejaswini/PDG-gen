import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int totalx;
		int totaly;
		int [][] kanko = new int[n][2];
		for(int i = 0; i < n; i++){
			kanko [i][0] = sc.nextInt();
			kanko [i][1] = sc.nextInt();
		}
		int x = kanko [0][0];
		int y = kanko [0][1];
		int answer = 0;
		int total;
		for(int i = 1;i < n;i++){
			if(kanko[i][0] - x > 0 && kanko[i][1] - y > 0){
				for(;;){
					x++;
					y++;
					answer++;
					if(kanko[i][0] == x || kanko[i][1] == y){
						break;
					}
				}
			}
			else if (kanko[i][0] - x < 0 && kanko[i][1] - y < 0){
				for(;;){
					x--;
					y--;
					answer++;
					if(kanko[i][0] == x || kanko[i][1] == y){
						break;
					}
				}
			}
			totalx = kanko[i][0] - x;
			totaly = kanko[i][1] - y;
			if(totalx < 0){
				totalx *= -1;
			}
			if(totaly < 0){
				totaly *= -1;
			}
			total = totalx + totaly;
			answer += total;
			x = kanko[i][0];
			y = kanko[i][1];
		}
		System.out.println(answer);
	}

}