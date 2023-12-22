import java.util.*;

class Main{


    public static void main(String[] args){
	int H,W,N;
	int[][] cMap = new int[1100][1100];
	Scanner in = new Scanner(System.in);

	while(true){
	    int[][] Map = new int[1100][1100];
	    for(int i=0;i<1100;i++)for(int J=0;J<1100;J++)cMap[J][i] = 0;
	    H = in.nextInt();
	    W = in.nextInt();
	    N = in.nextInt();
	    if(H+W+N == 0)break;
	    for(int i=1;i<=H;i++){
		for(int j=1;j<=W;j++){
		    Map[i][j] = in.nextInt();
		}
	    }
	    cMap[1][1] = N;//奇数ならそのまま偶数なら別
	    for(int i=1;i<=H;i++){
		for(int j=1;j<=W;j++){

		    cMap[i][j+1] += cMap[i][j]/2; 
		    cMap[i+1][j] += cMap[i][j]/2;
		    if(cMap[i][j]%2 != 0 ){
			if(Map[i][j] == 1){
			    cMap[i][j+1]++;
			}
			else {
			    cMap[i+1][j]++;
			}
		    }
		}
	    }
	    /*
	    for(int i=1;i<=H;i++){
		for(int j=1;j<=W;j++)System.out.print(cMap[i][j]+" ");
		System.out.println();
	    }
	    */
	    int x,y;
	    x = y = 1;
	    while(1<= y && y <= H && 1<= x && x<= W){
		if(cMap[y][x]%2 == 0){
		    if(Map[y][x] == 1)y++;
		    else x++;
		}
		else{
		    if(Map[y][x] == 1)x++;
		    else y++;
		    
		}
	    }
	    System.out.println(y + " " + x);



	}

    }

}