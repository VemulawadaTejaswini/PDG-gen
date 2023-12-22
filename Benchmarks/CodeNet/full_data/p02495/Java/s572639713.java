import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()) {
	    String gara = "#"; // 現在の柄
	    int H = scan.nextInt();
	    int W = scan.nextInt();

	    if (0==H && 0==W)
		break;
	    
	    for (int i=0; i<H; i++) {
		for (int j=0; j<W; j++) {
		    System.out.print(gara);
		    if (gara.equals("#")) {
			gara = ".";
		    } else {
			gara = "#";
		    }
		}
		System.out.print("\n");
	    }
	    System.out.print("\n");
	}
    }
}