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
	int odd = 0;
	for(int i = 0; i < n; i++){
	    count += ab[i];
	    int tmp = 0;
	    if(s[i].charAt(0) == 'B'){
		oddb++;
		tmp++;
	    }
	    if(s[i].charAt(s[i].length()-1) == 'A'){
		odda++;
		tmp++;
		if(tmp == 2){
		    odd++;
		}
	    }
	}

	/*
	System.out.println("odd : "+odd);
	System.out.println("odda : "+odda);
	System.out.println("oddb : "+oddb);
	*/

	if(odd > 0){
	    count += (odd-1);
	    odda = odda-(odd-1);
	    oddb = oddb-(odd-1);
	}
	count += Math.min(odda,oddb);

	if(odd == n){
	    count--;
	}

	/* 出力 */
	System.out.println(count);
	
    }
}
