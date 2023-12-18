import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    int length = in.nextInt();
      	String str = in.next();
		int input = in.nextInt(); 
      	char[] charArray = str.toCharArray(); 
      	int[] countMore = new int[26];
		for (int i = 0; i < input; i++) {
          	int type = in.nextInt();  
          	if (type == 1) {
               	int pos = in.nextInt();
              	String c = in.next();
              	charArray[pos - 1] = c.charAt(0);              
            } else if (type == 2) {
				int start = in.nextInt() - 1;
              	int end = in.nextInt() - 1;       
              	if (start == end) {
	              	System.out.println(1);  
                } else {
					countMore = new int[26];                  	
					int minus = 0;
                    for (int j = start; j <= end; j++) {
                      	if (countMore[charArray[j] - 'a'] > 0) {
                          	minus++;
                        } else countMore[charArray[j] - 'a']++;
                    }
                    System.out.println(end-start+1-minus);
                }
            }
        }      
      
    }
 
}