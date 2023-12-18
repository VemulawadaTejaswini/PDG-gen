import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String s = keyboard.next();
		
		String[] command = new String[s.length()];
		String[] result = new String[s.length()];
		
		for(int i = 0; i < s.length(); i ++) {
			command[i] = s.substring(i, i+1);
		}
		
		int jj = 0;
		
			for(int j = s.length() - 1; j >= 0; j--) {
				if(command[j].equals("B")){
					if(j != 0 && command[j-1].equals("B")){
					}else{
						j--;
					}
				}else {
					result[jj] = command[j];
					jj++;
				}
			}

		for(int k = jj - 1; k>=0; k --) {
			System.out.print(result[k]);
		}

		keyboard.close();	
	}
}