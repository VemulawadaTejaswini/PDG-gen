import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int max,min;
		int[] a = new int[2];
		int[] b = new int[2];
		String str ;
		String[] result;

		
	int counter = 0;
		for(int i = 0; i < a.length;i++){
			str = s.nextLine();
			if(str.length() == 0)
			{
				break;
			}
			
			result = str.split(" ");
			
			a[i] = Integer.parseInt(result[0]);
			b[i] = Integer.parseInt(result[1]);
		}
		for(int i = 0; i < a.length;i++){
			int x = a[i];
			int y = b[i];
			while(x!=y){
				if(x>y){
					y += b[i];
				}else{
					x += a[i];
				}
			}
			min = x;
			max = (int)((long)a[i] * b[i] / min);
			System.out.println(max+" "+min);

		}
		


	}
}