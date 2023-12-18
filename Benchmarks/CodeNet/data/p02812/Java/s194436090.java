import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.next());
      	if (N == 0) {
        	System.out.println(0);
          	return;
        }
      	char[] s = sc.next().toCharArray();
      	int ansCnt = 0;
      	int cnt = 0;
      
		for (int i = 0; i < N; i++) {
        	if (s[i] == 'A') {
            	cnt++;
            } else if (s[i] == 'B' && cnt == 1) {
              	cnt++;
            } else if (s[i] == 'C' && cnt == 2) {
              	ansCnt++;
            	cnt = 0;
            } else {
            	cnt = 0;
            }
        }
      	System.out.println(ansCnt);
    }
}