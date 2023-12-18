import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
	int odds = 0;
	int diff = 0;
        for(int i = 1; i <= n; i++){
            diff = scan.nextInt();    
	    diff = diff % 2;
	    odds += diff;
	}

	long combi = 1;
	if(odds != 0){
	    for(int j = 1; j <= n-1; j++){
		combi = 2 * combi;
	    }
	}else if(p == 1){
	    combi = 0;
	}else{
	    for(int j = 1; j<= n-odds; j++){
	        combi = 2 * combi;
	    }
	}
	System.out.print(combi);	
    }
}
