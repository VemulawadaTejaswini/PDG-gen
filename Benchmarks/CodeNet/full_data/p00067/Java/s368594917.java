//Volume0-0067
import java.util.ArrayDeque;
import java.util.Scanner;

class El {
    public int x;
    public int y;
    public int r = 0;
    El(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {

    //declare
    private static ArrayDeque<El> q = new ArrayDeque<El>();
    private static       int            num,x,y;
    private static final int            L     = 12,
    		                            BLACK = 1;
    private static       int    [][]    ck = {{-1,0},{0,-1},{1,0},{0,1}},
                                        map;
    private static       char   []      ch;
    private static       boolean[][]    chk;

    public static void main(String[] args) {

    	String s;

        //input
        Scanner sc = new Scanner(System.in);
        out:while(sc.hasNext()){
            map = new int     [L][L];
            chk = new boolean [L][L];
            for(int i=0;i<L;i++){
            	if ((s = sc.nextLine()).equals("")){
            		continue out;
            	} else {
            		ch = s.toCharArray();
            		for(int j=0;j<L;j++){
            			map[i][j] = Character.digit(ch[j], 10);
            		}
            	}
            }

            //calculate
            num = 0;
            for(int i=0;i<L;i++){
                for(int j=0;j<L;j++){
                    if(map[i][j] == BLACK && !chk[i][j]){
                        num++;
                        DFS(i,j);
                    }
                }
            }

            //output
            System.out.println(num);
        }
    }

    public static void DFS(int i,int j){

        x = j;  y = i;

        do {
            if(map[y][x] == BLACK && !chk[y][x]){
                chk[y][x] = true;
                q.push(new El(x,y));
            }
        } while (update());
    }

    private static boolean update(){

        El e;
        boolean ret = false;
        while(!q.isEmpty()){
            e = q.peek();
            if(e.r == 4){
                q.pop();
                continue;
            }
            if(e.x + ck[e.r][0] >= 0 && e.x + ck[e.r][0] < L &&
               e.y + ck[e.r][1] >= 0 && e.y + ck[e.r][1] < L ) {
                x = e.x + ck[e.r][0];
                y = e.y + ck[e.r][1];
                e.r++;
                ret = true;
                break;
            } else {
                e.r++;
            }
        }
        return ret;
    }
}