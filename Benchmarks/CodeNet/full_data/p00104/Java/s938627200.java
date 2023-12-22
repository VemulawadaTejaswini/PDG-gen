import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int h, w;
    String[][] map;
    boolean[][] visit;
    int y, x;

    void run(){
	while(sc.hasNext()){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(h==0 && w==0) break;

	    map = new String[h][w];
	    visit = new boolean[h][w];

	    for(int i=0; i<h; i++){
		String s = sc.next();
		for(int k=0; k<w; k++)
		    map[i][k] = s.substring(k, k+1);
	    }

	    x = 0; y = 0;
	    visit[0][0] = true;
	    boolean con = true;

	    while(!map[y][x].equals(".") && con){
		visit[y][x] = true;
		if(map[y][x].equals(">"))  x++;
		else if(map[y][x].equals("v")) y++;
		else if(map[y][x].equals("^")) y--;
		else x--;

		if(visit[y][x]) con = false;
	    }

	    System.out.println(!con ? "LOOP":(x+" "+y));
	}
    }
}