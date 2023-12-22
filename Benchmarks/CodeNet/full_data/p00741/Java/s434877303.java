import java.util.*;

class Main{
    static int[][] field;
    static int w,h;
    static int count;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	w = sc.nextInt();
	h = sc.nextInt();

	while(w!=0 && h!=0){
	    field = new int[h][w];
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    field[i][j] = sc.nextInt();
		}
	    }

	    solve();

	    System.out.println(count);

	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static void solve(){
	count = 0;

	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(field[i][j]==1){
		    setNumber(j,i);
		    //System.out.println(j+" "+i);
		    count++;
		}
	    }
	}
    }

    public static void setNumber(int x, int y){
	int[] numSet = {1,0,-1};

	for(int i=0; i<numSet.length; i++){
	    for(int j=0; j<numSet.length; j++){
		if(!(numSet[i]==0 && numSet[j]==0) && x+numSet[j]>=0 && x+numSet[j]<w && y+numSet[i]>=0 && y+numSet[i]<h){
		    //System.out.println(x+" "+y);
		    if(field[y+numSet[i]][x+numSet[j]]==1){
			//System.out.println(x+" "+y);
			field[y][x] = 0;
			setNumber(x+numSet[j],y+numSet[i]);
			field[y][x] = 1;
		    }
		}
	    }
	}
	//System.out.println("("+x+","+y+")ツづー0ツづ可つオツづ慊つキツ。");
	field[y][x] = 0;
    }
}