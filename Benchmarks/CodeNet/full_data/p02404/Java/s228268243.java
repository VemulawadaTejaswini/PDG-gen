import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
      	
      	while(true){
        	String strArr[] = br.readLine().split(" ");
	        
          	int a = Integer.parseInt(strArr[0]);
    	    int b = Integer.parseInt(strArr[1]);
			if (a == 0 && b == 0) {
            	break;
            }
            
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < b; j++) {
                    if(i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                        sb.append("#");
                    } else {
                        sb.append(".");
                    }
                    
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}


