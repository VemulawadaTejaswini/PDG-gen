import java.util.Arrays;
import java.util.Scanner;

public class Amondai {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int A  = keyboard.nextInt();
		int B  = keyboard.nextInt();
		int C  = keyboard.nextInt();
		int D  = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] masu = S.split("");
		
		String ans = "Yes";
		if(C > D) {	
		  ans = "No";
        int count = 0;
        for(int m = B-2; m <= D; m++) {
          if(masu[m].equals("#")) {
              count = 0;
          } else {
                  count++;
                  if(count == 3) {
                      ans = "Yes";
                      break;
                  }
            }
          }	
      }
		
		if(ans.equals("Yes")) {
			for(int i = B-1; i < D-1; i++) {
				if(masu[i+1].equals(".")) {
					continue;
				}else if(masu[i+2].equals(".")) {
                	i++;
				}else {
					ans = "No";
					break;
				}
			}
		}
		
		if(ans.equals("Yes")) {
			for(int i = A-1; i < C-1; i++) {
				if(masu[i+1].equals(".")) {
					continue;
				}else if(masu[i+2].equals(".")) {
                	i++;
				}else {
					ans = "No";
					break;
				}
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
