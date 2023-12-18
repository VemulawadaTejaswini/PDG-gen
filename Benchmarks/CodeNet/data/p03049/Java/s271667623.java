import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	String[] s = new String[n];
	int[] ab = new int[n];
	for(int i = 0; i < n; i++){
	    s[i] = scan.next();
	    /* 文字列中の"AB"の個数を数える */
	    for(int j = 0; j < s[i].length(); j++){
		if(s[i].charAt(j) == 'A' && j != (s[i].length()-1)){
		    j++;
		    if(s[i].charAt(j) == 'B'){
			ab[i]++;
		    }
		}
	    }
	}

	/* デバッグ */
	/*
	for(int i = 0; i < n; i++){	    
	    System.out.println(ab[i]);
	}
	*/

	int count = 0;
	int oddb = 0;
	int odda = 0;
	for(int i = 0; i < n; i++){
	    count += ab[i];
	    if(s[i].charAt(0) == 'B'){
		oddb++;
	    }
	    if(s[i].charAt(s[i].length()-1) == 'A'){
		odda++;
	    }
	}
	count += Math.min(odda,oddb);

	/* 出力 */
	System.out.println(count);
	
    }
}
