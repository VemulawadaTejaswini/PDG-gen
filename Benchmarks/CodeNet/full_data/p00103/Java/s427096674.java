import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--=0){
			int runner = 0;
			int point = 0;
			int out = 0;
			while(out < 3){
				String c = sc.next();
				if(c.equals("HIT")){
					if(runner<3)runner++;
					else point++;
				}
				else if(c.equals("HOMERUN")){
					point += runner+1;
					runner = 0;
				}
				else{
					out++;
				}
			}
			System.out.println(point);
		}
	}
}