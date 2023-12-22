import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		while(true){
			int x = s.nextInt();
			int y = s.nextInt();

			if(x == 0 && y == 0){
				break;
			}

			int n = s.nextInt();
			RoadWork[] r = new RoadWork[n];

			for(int i = 0; i < n; i++){
				r[i] = new RoadWork(s.nextInt(), s.nextInt());
			}

			System.out.println(check(r, x, y));
		}

	}

	static class RoadWork{
		int x;
		int y;

		//RoadWork(){};
		RoadWork (int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	static int check(RoadWork[] r, int x, int y){

		int c = 0;

		out:for(int i = 1; i <= x; i++){
				for(int j = 1; j <= y; j++){
					for(int k = 0; k < r.length; k++){
						if(i == r[k].x && j == r[k].y){
							break out;
						}
					}
					c++;
				}
		}
		return c;
	}
}