import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int[][] masu = new int[10][10];
		String input = "";
		int x = -1;
		int y = -1;
		int s = -1;
		int cnt = 0;
		int max = 0;

		for(int i = 0;i < 10;i++){
			for(int j = 0;j <10;j++){
				masu[i][j] = 0;
			}
		}

		try{

			while((input = br.readLine()) != null){
				String[] inputs = input.split(",");
				x = Integer.parseInt(inputs[0]);
				y = Integer.parseInt(inputs[1]);
				s = Integer.parseInt(inputs[2]);

				drop(masu,x,y,s);

			}

		}catch(Exception e){

		}

		for(int i = 0;i < 10;i++){
			for(int j = 0;j <10;j++){
				if(masu[i][j] == 0){
					cnt++;
				}
				if(max <= masu[i][j]){
					max = masu[i][j];
				}
			}
		}

		System.out.println(cnt + "\n" + max);

	}

	static void drop(int blocks[][],int x, int y, int size){
        if(size == 1)//?°??????´
            min_drop(blocks, x, y);
        if(size == 2)
            mid_drop(blocks, x, y);
        if(size == 3)
            lag_drop(blocks, x, y);
    }

    static void min_drop(int blocks[][], int x, int y){
        blocks[x][y]++;
        if(x-1>-1)
            blocks[x-1][y]++;
        if(x+1<10)
            blocks[x+1][y]++;
        if(y-1>-1)
            blocks[x][y-1]++;
        if(y+1<10)
            blocks[x][y+1]++;
    }

    static void mid_drop(int blocks[][], int x, int y){
        min_drop(blocks, x, y);
        if(-1<x-1 && -1<y-1)
            blocks[x-1][y-1]++;
        if(x+1<10 && -1<y-1)
            blocks[x+1][y-1]++;
        if(-1<x-1 && y+1<10)
            blocks[x-1][y+1]++;
        if(x+1<10 && y+1<10)
            blocks[x+1][y+1]++;
    }

    static void lag_drop(int blocks[][], int x, int y){
        mid_drop(blocks, x, y);
        if(-1<y-2)
            blocks[x][y-2]++;
        if(y+2<10)
            blocks[x][y+2]++;
        if(-1<x-2)
            blocks[x-2][y]++;
        if(x+2<10)
            blocks[x+2][y]++;
    }

}