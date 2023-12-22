import java.util.*;

public class Main{
    public static void main(String[]args){
	int black;
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	int K = sc.nextInt();
	sc.nextLine();
	
	String str ="";
	String c[][]= new String[H][W];
	//String d[]= new String[W];
        int ans=0;
	
	for(int i=0; i<H; i++){
	    str = sc.next();
	    String d[] = str.split("");
	    for(int j=0; j<W; j++){
		c[i][j]=d[j];
	    }
	}

	for(byte maskR=0; maskR<(1<<H); maskR++){
	    for(byte maskC=0; maskC<(1<<W); maskC++){
		black=0;
		for(int i=0; i<H; i++){
		    for(int j=0; j<W; j++){
			if(((maskR>>i)&1)==0 &&
			   ((maskC>>j)&1)==0 &&
			   (c[i][j].equals("#"))){
			    black++;
			}
		    }
		}
		if(black==K){
		    ans++;
		}
	    }
	}
	System.out.println(ans);
    }
}
