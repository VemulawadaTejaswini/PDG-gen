
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
 
    static int h,w;
    static int[] v1={0,1,0,-1};
    static int[] v2={1,0,-1,0};
    static int[][] field;
    static Queue<Integer[]> q = new LinkedList<Integer[]>();
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(true){
            h = cin.nextInt();
            w = cin.nextInt();
            if(h+w==0){
                break;
            }
            field= new int[h+2][w+2];
            for(int i = 1;i<=h;i++){
                String ss = cin.next();
                char[] s = ss.toCharArray();
                for(int j = 1;j<=w;j++){
                    if(s[j-1]=='@'){
                        field[i][j]=1;
                    }
                    else if(s[j-1]=='#'){
                        field[i][j]=2;
                    }
                    else if(s[j-1]=='*'){
                        field[i][j]=3;
                    }
                }
            }
            int cnt=0;
            for(int i = 1;i<=h;i++){
                for(int j = 1;j<=w;j++){
                    if(dfs(i,j, field[i][j],0)){
                        cnt++;
                        //output();
                    }
                    boolean f = false;
                    while(!q.isEmpty()){
                    	Integer[] a = q.poll();
                    	dfs(a[0],a[1],field[a[0]][a[1]],0);
                    	f=true;
                    }
                    if(f){
                    	//System.out.println("QUEUEUEUEUE");
                    	//output();
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    static boolean dfs(int x,int y,int now,int depth){
    	if(depth>=100){
    		Integer[] next = {x,y};
    		q.add(next);
    		return true;
    	}
        if(now!=0 && field[x][y]==now){
            field[x][y]=0;
            for(int i = 0;i<4;i++){
            	int xx=x+v1[i];
            	int yy=y+v2[i];
            	if(field[xx][yy]==now){
            		dfs(xx,yy,now,depth+1);	
            	}
            }
            return true;
        }
        else{
            return false;
        }
    }
    static void output(){
    	for(int i = 1;i<=h;i++){
    		for(int j = 1;j<=w;j++){
    			System.out.print(field[i][j]+" " );
    		}
    		System.out.println();;
    	}
    	System.out.println();;
    }
}