//Volume0-0078
import java.util.Scanner;

class P {
	public int x;
	public int y;
}

public class Main {

	//declare
	private static int     n;
	private static int[][] square;

	public static void main(String[] args) {

		int     max;
		P       p;

        //input
        Scanner sc = new Scanner(System.in);
        while((n = sc.nextInt()) != 0){
        	square = new int[n][n];
        	max = (int)Math.pow(n, 2);
        	p = start_p(n);
        	for(int i=1;i<=max;i++){
        		square[p.y][p.x] = i;
        		p = next_p(p);
        	}
        	print();
        }
	}

	private static P start_p(int n){
		P ret = new P();
		ret.x = (n - 1) / 2;
		ret.y = ret.x + 1;
		return ret;
	}

	private static P next_p(P p){
		p.x = (p.x + 1) % n;
		p.y = (p.y + 1) % n;
		if(square[p.y][p.x] != 0){
			p.x = (p.x - 1 + n) % n;
			p.y = (p.y + 1) % n;
		}
		return p;
	}

	private static void print(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.printf("%4d",square[i][j]);
			}
			System.out.println();
		}
	}
}