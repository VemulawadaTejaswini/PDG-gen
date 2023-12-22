import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			Scanner sc2 = new Scanner(sc.nextLine());

			int h = sc2.nextInt();

			int w = sc2.nextInt();

			

			if((w|h)==0)break;

			

			int[][] map = new int[h][w];

			int[] dx = {0,0,1,-1,0};

			int[] dy = {-1,1,0,0,0};

			for(int i =0 ; i < h; i++){

				String buffer = sc.nextLine();

				for(int j = 0; j < w; j++){

					char b = buffer.charAt(j);

					int mapn = 4;

					switch(b){

					case '^':

						mapn = 0;

						break; 

					case 'v':

						mapn = 1;

						break; 

					case '>':

						mapn = 2;

						break; 

					case '<':

						mapn = 3;

						break; 

					}

					map[i][j] = mapn;

				}

			}

			boolean hasVisited[][] =new boolean[h][w];

			String ret = "";

			for(int x=0,y=0;;x+=dx[map[y][x]],y+=dy[map[y][x]]){

				if(hasVisited[y][x]) {

					ret = "LOOP";

					break;

				}

				hasVisited[y][x] = true;

				if(map[y][x] == 4){

					ret = x+" "+y;

					break;

				}

			}

			System.out.println(ret);			

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}