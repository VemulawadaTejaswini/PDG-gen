import java.util.Scanner;

public class Main {

    public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	for(int i = 0;;++i){
	    int j = sc.nextInt();
	    if (j == 0){return;}
	    
	    System.out.printf("Case %d: %d\n", i, j);
	}
    }
}