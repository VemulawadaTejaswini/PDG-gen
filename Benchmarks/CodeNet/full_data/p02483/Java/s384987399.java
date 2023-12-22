import java.util.Scanner;

public class AOJ10004.java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		
		if(inputArray.length == 3){
			int[] str = {0,0,0};
			int sub;
			for(int i = 0; i < 3; i++) str[i] = Integer.parseInt(inputArray[i]);
			if(str[0] > str[1]){
				sub = str[0];
				str[0] = str[1];
				str[1] = sub;
			}
			if(str[1] > str[2]){
				sub = str[1];
				str[1] = str[2];
				str[2] = sub;
			}
			if(str[0] > str[1]){
				sub = str[0];
				str[0] = str[1];
				str[1] = sub;
			}
			System.out.print(str[0]+" "+str[1]+" "+str[2]);
		}

	}

}