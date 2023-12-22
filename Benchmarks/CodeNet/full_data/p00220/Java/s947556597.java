import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    double n;
    boolean[] bitsI; // 8テヲツ閉エテヲツ閉ー
    boolean[] bitsD; // 4テ・ツーツ湘ヲツ閉ー
    boolean NA;
    int a;
    double b;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextDouble();
	    if(n<0) break;
	    bitsI = new boolean[8];
	    bitsD = new boolean[4];
	    NA = false;

	    a = (int)n/1;
	    b = n - a;

	    NA = getBitD() || getBitI();


	    if(NA) System.out.println("NA");
	    else show();
	}
    }

    boolean getBitI(){
	if(a>255) return true;
	int c = 128;
	for(int i=0; i<bitsI.length; i++){
	    if(a>=c){
		bitsI[i] = true;
		a -= c;
	    }
	    c /= 2;
	}
	if(a==0) return false;
	return true;
    }

    boolean getBitD(){
	if(b<0.03125) return true;
	double c = 0.5;
	for(int i=0; i<bitsD.length; i++){
	    if(b>=c){
		bitsD[i] = true;
		b -= c;
	    }
	    c /= 2;
	}
	if(b==0.0) return false;
	return true;
    }
		
    void show(){
	for(int i=0; i<bitsI.length; i++)
	    System.out.print(bitsI[i] ? "1" : "0");
	System.out.print(".");
	for(int i=0; i<bitsD.length; i++)
	    System.out.print(bitsD[i] ? "1" : "0");
	System.out.println();
    }
}