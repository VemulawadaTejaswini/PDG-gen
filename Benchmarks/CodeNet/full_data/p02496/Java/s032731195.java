import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean[][] exist = new boolean[4][13];
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				exist[i][j] = true;
			}
		}
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String card = sc.next();
			int num = sc.nextInt()-1;
			exist[StrToInt(card)][num] = false;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(exist[i][j]) System.out.println(NumToStr(i)+" "+(j+1));
			}
		}
	}
	public static String NumToStr(int i){
		switch(i){
		case 0: {
			return "S";
		}
		case 1: {
			return "H";
		}
		case 2: {
			return "C";
		}
		case 3: {
			return "D";
		}
		}
		return "error";
	}
	public static int StrToInt(String s){
		switch(s){
		case "S": {
			return 0;
		}
		case "H": {
			return 1;
		}
		case "C": {
			return 2;
		}
		case "D": {
			return 3;
		}
		}
		return -1;
	}

}