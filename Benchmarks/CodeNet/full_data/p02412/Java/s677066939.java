import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(true) {
    	String strArr[] = br.readLine().split(" ");
      	int x = Integer.parseInt(strArr[0]);
      	int y = Integer.parseInt(strArr[1]);
      	if(x == 0 && y == 0) {
        	break;
        }
      	int i, j, k;
        int count = 0;
        for (i = 1; i <= x - 2; i++) {
        	for (j = i + 1; j <= x - 1; j++) {
            	for (k = j + 1; k <= x; k++) {
                  	if(i + j + k == y) {
                    	count++;
                    }
                }
            }
          
        }
      System.out.println(count);
    }    
        
    
        
    }
}
