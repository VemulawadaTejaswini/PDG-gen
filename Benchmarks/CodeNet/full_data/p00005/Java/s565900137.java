import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int max,min;
		int a,b;
		String str ;
		String[] result;

		
	int counter = 0;
		while(true){
			str = s.nextLine();
			if(str.length() == 0)
			{
				break;
			}
			
			result = str.split(" ");
			
			a = Integer.parseInt(result[0]);
			b = Integer.parseInt(result[1]);
			int x = a;
			int y = b;
			while(x!=y){
				if(x>y){
					y += b;
				}else{
					x += a;
				}
			}
			min = x;
			max = (int)((long)a * b / min);
			System.out.println(max+" "+min);




	}
}