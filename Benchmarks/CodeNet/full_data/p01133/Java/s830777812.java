import java.util.*;

class Main{
    static String mark;
    static int[][] crys;
    static int n;
    static int[] findMark;
    static double[] distA;
    static double[][] distY;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	int hx = sc.nextInt();
	int hy = sc.nextInt();
	int dx = sc.nextInt();
	int dy = sc.nextInt();

	while(n!=0){
	    crys = new int[n][2];
	    distA = new double[n];
	    for(int i=0; i<n; i++){
		crys[i][0] = sc.nextInt();
		crys[i][1] = sc.nextInt();
		distA[i] = getDistance(dx,dy,i);
	    }

	    distY = new double[n+1][n];
	    for(int i=1; i<=n; i++){
		distY[0][i-1] = getDistance(hx,hy,i-1);
		for(int j=0; j<n; j++){
		    distY[i][j] = getDistance(crys[i-1][0],crys[i-1][1],j);
		}
	    }

	    findMark = new int[n];
	    mark = "NO";
	    solve(-1,0,0.0);
	    System.out.println(mark);

	    n = sc.nextInt();
	    hx = sc.nextInt();
	    hy = sc.nextInt();
	    dx = sc.nextInt();
	    dy = sc.nextInt();
	}
    }

    public static void solve(int pos, int findNum, double radius){
	if(mark.equals("YES")){return;}
	if(findNum==n){mark = "YES"; return;}

	for(int i=0; i<findMark.length; i++){
	    if(findMark[i]==0 && distY[pos+1][i] >= distA[i]-radius){return;}
	}

	for(int i=0; i<findMark.length; i++){
	    if(findMark[i]==0){
		if(distY[pos+1][i]<distA[i]-radius){
		    findMark[i] = 1;	
		    solve(i,findNum+1,distY[pos+1][i]+radius);
		    if(mark=="YES")break;
		    findMark[i] = 0;
		}else return;
	    }
	}
    }

    public static double getDistance(int x, int y, int i){
	return  Math.sqrt((x-crys[i][0])*(x-crys[i][0])+(y-crys[i][1])*(y-crys[i][1]));
    }
}