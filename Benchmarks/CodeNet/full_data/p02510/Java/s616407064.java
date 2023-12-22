import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String cards = stdIn.next();
			int m = stdIn.nextInt();
			if(cards == "-") break;
			for(int i=0;i<m;i++){
				int h = stdIn.nextInt();
				String temp = cards.substring(0,h);
				cards = cards.concat(temp);
				cards = cards.substring(h);
			}
			System.out.println(cards);
		}
	}
}