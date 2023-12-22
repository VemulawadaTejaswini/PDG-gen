import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    void run(){
	int n = kbd.nextInt();
	int data = 0;
	while(n>0){
	    if(data>0)
		System.out.println();
	    solve();
	    n--;
	    data++;
	}
    }


    void solve(){
	int[][] field = new int[9][9];
	boolean[][] tf = new boolean[9][9]; // テヲツュツ」テ」ツ?療」ツ??・ツ?・テ・ツ環崚」ツ?古」ツ?陛」ツつ古」ツ?ヲテ」ツ??」ツつ凝」ツ?凝ッツシツ?
	int i, j;
	for(i=0; i<9; i++)	
	    Arrays.fill(tf[i], true);
	for(i=0; i<9; i++){
	    for(j=0; j<9; j++){
		field[i][j] = kbd.nextInt();
	    }
	}
	// テ・ツ?・テ・ツ環崚」ツ?禿」ツ?禿」ツ?セテ」ツ?ァ

	// テ」ツδ?」ツつァテ」ツδε」ツつッテ」ツ?禿」ツ?禿」ツ?凝」ツつ?
	/*
	  1テ」ツ?凝」ツつ?テ」ツ?セテ」ツ?ァテ」ツ??テ」ツ?、テ」ツ?堙」ツ?、テ、ツスツソテ」ツつ湘」ツつ古」ツ?ヲテ」ツ??」ツつ古」ツ?ーtrue
	  ティツカツウテ」ツつ甘」ツ?ェテ」ツ??ヲツ閉ーテ・ツュツ療」ツ?古」ツ?づ」ツつ?= テ・ツ、ツ堙」ツ??ヲツ閉ーテ・ツュツ療」ツ?古」ツ?づ」ツつ凝」ツ?凝」ツつ嘉」ツ??・ツ、ツ堙」ツ??」ツδ榲」ツつケテ」ツつ断alseテ」ツ?ォテ」ツ?凖」ツつ?
	*/

	int[] c; // テ」ツδ?」ツつァテ」ツδε」ツつッテ」ツ?凖」ツつ凝ヲツ閉ーテ・ツュツ療」ツ?ョテ・ツ崢コテ」ツ?セテ」ツつ?
	int[][] x; // テ」ツδ?」ツつァテ」ツδε」ツつッテ、ツクツュテ」ツ?ョテ・ツコツァテヲツィツ?

	// i テ」ツδゥテ」ツつ、テ」ツδウテ」ツδ?」ツつァテ」ツδε」ツつッ
	for(i=0; i<9; i++){
	    c = new int[9];
	    x = new int[9][2];
	    for(j=0; j<9; j++){
		int d = field[i][j]-1; // テ」ツδ榲」ツつケテ」ツ?ォテ」ツ?づ」ツつ凝ヲツ閉ーテ・ツュツ?
		c[d]++;
		if(c[d]>1){
		    tf[i][j] = false;
		    tf[x[d][0]][x[d][1]] = false;
		}
		else{
		    x[d][0] = i;
		    x[d][1] = j;
		}
	    }
	}

	// j テ」ツδゥテ」ツつ、テ」ツδウテ」ツδ?」ツつァテ」ツδε」ツつッ
	for(j=0; j<9; j++){
	    c = new int[9];
	    x = new int[9][2];
	    for(i=0; i<9; i++){
		int d = field[i][j]-1; // テ」ツδ榲」ツつケテ」ツ?ォテ」ツ?づ」ツつ凝ヲツ閉ーテ・ツュツ?
		c[d]++;
		if(c[d]>1){
		    tf[i][j] = false;
		    tf[x[d][0]][x[d][1]] = false;
		}
		else{
		    x[d][0] = i;
		    x[d][1] = j;
		}
	    }
	}

	// テ・ツ崢崚ィツァツ津・ツ個コテ・ツ按?」ツつ甘」ツδ?」ツつァテ」ツδε」ツつッ
	for(int si=0; si<9; si+=3){
	    for(int sj=0; sj<9; sj+=3){
		c = new int[9];
		x = new int[9][2];
		for(i=si; i<si+3; i++){	    
		    for(j=sj; j<sj+3; j++){
			int d = field[i][j]-1; // テ」ツδ榲」ツつケテ」ツ?ォテ」ツ?づ」ツつ凝ヲツ閉ーテ・ツュツ?
			c[d]++;
			if(c[d]>1){
			    tf[i][j] = false;
			    tf[x[d][0]][x[d][1]] = false;
			}
			else{
			    x[d][0] = i;
			    x[d][1] = j;
			    //System.out.println("*"+x[d][0]+" "+x[d][1]+"*");
			}
		    }
		}
		//System.out.println();
	    }
	}
	    
	// ティツ。ツィテァツ、ツコ
	for(i=0; i<9; i++){
	    for(j=0; j<9; j++){
		if(tf[i][j]){
		    System.out.print(" "+field[i][j]);
		}
		else 
		    System.out.print("*"+field[i][j]);
	    }
	    System.out.println();
	}
    }
}
	