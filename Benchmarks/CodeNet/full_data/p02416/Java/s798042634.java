import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);

		while(true){
			String x = scan.next();
			if(x.equals ("0")) break;
			
			int sl = x.length();
			int total = 0;
			for(int i=0; i<sl; i++){
				String s = x.substring(i, i+1);
				int X = Integer.parseInt(s);
				total = total + X;
			}
			System.out.println(total);
		}
	
	}

}