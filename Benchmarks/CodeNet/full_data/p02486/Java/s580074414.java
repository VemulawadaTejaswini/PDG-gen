import java.util.Scanner;

public class Main {

    public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = sc.nextInt();
	if(n == 0 && x == 0) return;
	int count = 0;
	
	OUTER:
	for(int i = 0;i < n; ++i){
	    for(int j = i;j < n; ++j){
		for(int k = j;k < n; ++k){
		    if (i + j>x) break OUTER;
		    if (i + j + k == x) ++count;
		}
	    }
	}
	
	sc.close();
    }
}