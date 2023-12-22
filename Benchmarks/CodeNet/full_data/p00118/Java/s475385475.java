import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class E{

		int i;

		int j;

		char x;

		E(int i,int j,char x){

			this.i = i;

			this.j = j;

			this.x = x;

		}

	}



	LinkedList<E> list = new LinkedList<Main.E>();

	

	void label(char map[][],E e){

		label(map,e.i,e.j,e.x);

	}

	

	void label(char map[][],int i,int j,char x){

		int dx[] ={0,0,-1,1};

		int dy[] ={1,-1,0,0};

		for(int a = 0 ; a < 4;a++){

			int ni = i + dx[a];

			int nj = j + dy[a];

			if(map[ni][nj] == x){

				map[ni][nj] = '_';

				list.add(new E(ni,nj,x));

			}

		}

	}

	

	void run() {

		for (;;) {

			int h = sc.nextInt();

			int w = sc.nextInt();

			if ((h | w) == 0)

				break;

			char map[][] = new char[h + 2][w + 2];

			

			for(int i =1; i < h+1;i++){

				String buffer = "_"+sc.next()+"_";

				map[i] = buffer.toCharArray();

			}

			for(int i = 0; i < w+2;i++){

				map[0][i]='_';

				map[h+1][i] = '_';

			}

			int num = 0;

			for(int i = 1; i < h+1;i++){

				for(int j= 1; j < w+1;j++){

					if(map[i][j] != '_'){

						char x = map[i][j];

						map[i][j]='_';

						label(map,i,j,x);

						num++;

					}

					for(;!list.isEmpty();){

						label(map,list.poll());

					}

				}

			}

			System.out.println(num);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}