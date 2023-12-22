import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		solve(n);
	    }
	}
    }

    static void solve(int n){
	int w = kbd.nextInt();
	int h = kbd.nextInt();
	boolean[][] field = new boolean[w][h];
	putTree(field, n);
	int s = kbd.nextInt();
	int t = kbd.nextInt();
	int maxTree = 0;
	int tree = 0;

	int i, j;
	for(i=0; i+s-1<w; i++){
	    for(j=0; j+t-1<h; j++){
		//System.out.println(i+" "+j+" "+s+" "+t);
		tree = search(field, i, s, j, t);
		if(tree > maxTree) maxTree = tree;
	    }
	}
	System.out.println(maxTree);
    }

    static void putTree(boolean[][] field, int n){
	while(n>0){
	    int x = kbd.nextInt();
	    int y = kbd.nextInt();
	    field[x-1][y-1] = true;
	    n--;
	}
    }

    static int search(boolean[][] field, int bi, int s, int bj, int t){
	int tree=0;
	int x, y; 
       	for(x=bi; x-bi<s; x++){
	    for(y=bj; y-bj<t; y++){
		//System.out.println(x+" "+y+" *"+bi+" "+bj+" *"+s+" "+t);
		if(field[x][y]) {
		    tree++;
		    //System.out.println((x+1)+" "+(y+1));
		}
	    }
	}
	//System.out.println(tree);
	return tree;
    }
}