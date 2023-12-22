import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int x = stdin.nextInt();
	int y = stdin.nextInt();
        int w = 0;
	if(y<x){
	    w = y;
	    y = x;
	    x = w;
	}
	while(x!=0 || y!=0){
	    System.out.println(x+" "+y);
	    x = stdin.nextInt();
	    y = stdin.nextInt();
	    if(y<x){
		w = y;
		y = x;
		x = w;
	    }
	}
    }
}

	