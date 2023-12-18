import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
      	char[] charArray = s.next().toCharArray();
      
      	StringBuilder sb_even = new StringBuilder();
      	StringBuilder sb_odd = new StringBuilder();
      	int even_cnt = 0;
      	int odd_cnt = 0;
      	for(int i = 0; i < charArray.length; i++) {
        	if (i % 2 != 0)  {
              if (charArray[i] == 'L' || charArray[i] == 'U' || charArray[i] == 'D') {
              	sb_even.append(charArray[i]);
              }
              even_cnt++;
            } else {
              if (charArray[i] == 'R' || charArray[i] == 'U' || charArray[i] == 'D') {
              	sb_odd.append(charArray[i]);
              }
              odd_cnt++;
            }
        }

      if (sb_even.length() == even_cnt && sb_odd.length() == odd_cnt) {
      	System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}