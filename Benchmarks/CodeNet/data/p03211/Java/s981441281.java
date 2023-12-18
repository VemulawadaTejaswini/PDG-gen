import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String S = scan.next();

	int min = Integer.MAX_VALUE;
	
	for(int i = 0; i < S.length()-2; i++){
	    int num = Integer.parseInt(S.substring(i, i+3));

	    //753との差の絶対値を求める
	    int diff = Math.abs(num-753);

	    if(min > diff){
		min = diff;
	    }
	}

	System.out.println(min);
    }
}
