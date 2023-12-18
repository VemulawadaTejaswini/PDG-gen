import java.io.IOException;
import java.util.Scanner;
public class Main {
	static int h;
	static int w;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();

        int count = 0;

        boolean[][] card = new boolean[h][w];

        for(int i=0; i<h; i++) {
        	for(int j=0; j<w; j++) {
        		judge(card, i, j);
        	}
        }

        for(int i=0; i<h; i++) {
        	for(int j=0; j<w; j++) {
        		if(!card[i][j]) {
        			count++;
        		}
        	}
        }

        System.out.println(count);

        sc.close();
    }

    public static void judge(boolean[][] card, int i, int j) {
    	// 走査用変数
    	int x,y = 0;

    	x = i-1;
    	y = j-1;
    	// ①左上
    	if(x>=0 && y>=0) {
    		if(card[x][y]) {
    			card[x][y] = false;
    		}else {
    			card[x][y] = true;
    		}
    	}

    	// ②上
    	if(x>=0) {
    		if(card[x][j]) {
    			card[x][j] = false;
    		}else {
    			card[x][j] = true;
    		}
    	}

    	// ③左
    	if(y>=0) {
    		if(card[i][y]) {
    			card[i][y] = false;
    		}else {
    			card[i][y] = true;
    		}
    	}

    	x = i+1;
    	y = j+1;
    	// ④右下
    	if(x<h && y<w) {
    		if(card[x][y]) {
    			card[x][y] = false;
    		}else {
    			card[x][y] = true;
    		}
    	}

    	// ⑤下
    	if(x<h) {
    		if(card[x][j]) {
    			card[x][j] = false;
    		}else {
    			card[x][j] = true;
    		}
    	}

    	// ⑥右
    	if(y<w) {
    		if(card[i][y]) {
    			card[i][y] = false;
    		}else {
    			card[i][y] = true;
    		}
    	}

    	// ⑦右上
    	x = i-1;
    	y = j+1;
    	if(x>=0 && y<w) {
    		if(card[x][y]) {
    			card[x][y] = false;
    		}else {
    			card[x][y] = true;
     		}
    	}

    	// ⑧左下
    	x = i+1;
    	y = j-1;
    	if(x<h && y>=0) {
    		if(card[x][y]) {
    			card[x][y] = false;
    		}else {
    			card[x][y] = true;
     		}
    	}
    }
}