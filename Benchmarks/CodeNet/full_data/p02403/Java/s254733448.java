import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      
      	while(true) {
        	String strArr[] = br.readLine().split(" ");
	        int a = Integer.parseInt(strArr[0]);
    	    int b = Integer.parseInt(strArr[1]);
          	if (a == 0 && b == 0) {
            	break;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < b; i++) {
                sb.append("#");
            }
            for(int i = 0; i < a; i++) {
                System.out.println(sb.toString());
            }
            System.out.println();
        }
    }
}
