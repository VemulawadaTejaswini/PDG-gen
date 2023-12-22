import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[70][70];
		int w, h;
		String temp;
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) break;

			for(int i=0; i<h; i++){
				temp = sc.next();
				Arrays.fill(map[i], -1);
				for(int j=0; j<w; j++){
					if(temp.charAt(j)>='0' && temp.charAt(j)<='9'){
						map[i][j] = temp.charAt(j) - '0';
					}
				}
			}
			Arrays.fill(map[h], -1);

			String sum = "", max = "";
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					if(map[i][j]>0 && map[i][j]<10){
						sum = check(map, i, j);

						if(max.length() < sum.length()){
							max = sum;
						}else if(max.length()==sum.length()){
							for(int n=0; n<max.length(); n++){
								if(max.charAt(n)<sum.charAt(n)){
									max = sum;
									break;
								}else if(max.charAt(n)>sum.charAt(n)){
									break;
								}
							}
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	public static String check(int[][] map, int i, int j){
		Deque<Point> q = new ArrayDeque<Point>();
		Point p = new Point(j, i, "");
		String max = "";
		q.offer(p);
		while(!q.isEmpty()){
			p = q.poll();
			p.num = p.num + String.valueOf(map[p.y][p.x]%10);
			map[p.y][p.x] += 10;

			if(max.length() < p.num.length()){
				max = p.num;
			}else if(max.length()==p.num.length()){
				for(int n=0; n<max.length(); n++){
					if(max.charAt(n)<p.num.charAt(n)){
						max = p.num;
						break;
					}else if(max.charAt(n)>p.num.charAt(n)){
						break;
					}
				}
			}

			if(map[p.y+1][p.x]!=-1){
				Point p1 = new Point(p.x, p.y+1, p.num);
				q.offer(p1);
			}
			if(map[p.y][p.x+1]!=-1){
				Point p2 = new Point(p.x+1, p.y, p.num);
				q.offer(p2);
			}
		}
		return max;
	}

	public static class Point{
		int x, y;
		String num;
		Point(int i, int j, String sum){
			x = i;
			y = j;
			num = sum;
		}
	}
}