import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> matrix = new ArrayList<String>();
		String s = scanner.nextLine();
		String[] temp = s.split(" ");
		int row = Integer.parseInt(temp[0]);
		int col = Integer.parseInt(temp[1]);
		//System.out.println("row: " + row);
		int flag = 0;
		
		for(int i=0;i<row;i++){
			String test = scanner.nextLine();			
			matrix.add(test);
			//System.out.println(i);
			//System.out.println(test);
			
			for(int j=0;j<col;j++){
				if(test.length() - test.replace(".", "").length()%2 == 0){
					;
				}else{
					flag = 1;
				}
			}
			
		}
		
		if(flag==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
