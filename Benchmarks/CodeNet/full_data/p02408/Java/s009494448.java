
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, w, i, v, card[][], a[][];
		String m;
		card = new int[4][13];
		a = new int[4][];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(w = 0; w < 4; w++){
			for(v = 0; v < 13; v++){
				card[w][v] = 0;
			}
		}
		
		for(v = 0; n > v; v++){
			m = sc.next();
			i = sc.nextInt();
			switch(m){
			case "S" : card[0][i - 1] = 1;
						break;
			case "H" : card[1][i - 1] = 1;
						break;
			case "C" : card[2][i - 1] = 1;
						break;
			case "D" : card[3][i - 1] = 1;
						break;
			}
		}
		
		for(w = 0; w < 4; w++){
			for(v = 0; 13 > v; v++){
				if(card[w][v] == 0){
					switch(w){
					case 0 : System.out.println("S " + (v + 1));
								break;
					case 1 : System.out.println("H " + (v + 1));
								break;
					case 2 : System.out.println("C " + (v + 1));
								break;
					case 3 : System.out.println("D " + (v + 1));
								break;
					}
				}
			}
		}
	}
}