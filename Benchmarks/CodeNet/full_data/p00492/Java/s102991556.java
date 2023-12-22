import java.util.*;

class Main{

    public static int gyo,retu;
    //yªô©ï©ÉæÁÄdx,dyÍÏíé
    //(1,1)ÌyÍïÈÌÅdx[1][],dy[1][]ðg¤
    //±ÌÆ«Édx[0][],dy[0][]ðgÁÄµÜ¤Æ(2,2)ðÝÈ¢Å(0,2)ðÝÄµÜ¤
  
    public static int[][] dx={{1,0,-1,0,-1,-1},{1,0,-1,0,1,1}};
    public static int[][] dy={{0,1,0,-1,1,-1},{0,1,0,-1,-1,1}};
    public static int[][] map = new int[105][105]; 

    public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	retu = in.nextInt();
	gyo = in.nextInt();

	for(int i=0;i<=gyo+1;i++){
	    for(int j=0;j<=retu+1;j++)map[i][j]=0;
	}
	
	//System.out.println("Hello, World!");
	for(int i=1;i<=gyo;i++){
	    for(int j=1;j<=retu;j++)map[i][j]=in.nextInt();
	}		

	System.out.println(dfs(0,0));

    }

    public static int dfs(int x,int y){
	map[y][x]=9; //fobOÅ©â·¢æ¤É9Æµ½
	int nx,ny,ans=0;
	/*
	for(int f=0;f<10;f++){
	    for(int g=0;g<10;g++)System.out.print(map[f][g] + " ");
	    System.out.printf("\n");
	}
	*/

	for(int i=0;i<6;i++){
	    nx = x + dx[y%2][i];
	    ny = y + dy[y%2][i];
	    if(nx > retu+1 || ny > gyo+1 || nx<0 || ny<0)continue;

	    if(map[ny][nx] == 1)ans++;
	    else if(map[ny][nx] == 0)ans += dfs(nx,ny);

	}

	return ans;
    }



}