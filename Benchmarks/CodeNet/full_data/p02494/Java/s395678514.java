import java.util.Scanner;

public class Main {
    static void printline(int w){
	for(int i = 0;i<w;++i){
	    System.out.print("#");
	}
	System.out.print("\n");
    }
    public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	for(;;){
	    int h = sc.nextInt();
	    int w = sc.nextInt();
	    if (h == 0 && w == 0) return;

	    for(int i = 0;i<h;++i) printline(w);
	    System.out.print("\n");
	}
    }
}