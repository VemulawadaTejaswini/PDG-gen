import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n, m;
	
	while(true){
	    n = s.nextInt();
	    m = s.nextInt();
	    if(n == 0 && m == 0) break;

	    for(int i = 0 ; i < n ; i++){
		for(int j = 0 ; j < m ; j++){
		    if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) System.out.printf("#");
		    else System.out.printf(".");
		}
		System.out.println();
	    }
	    System.out.println();
	}
    }
}		