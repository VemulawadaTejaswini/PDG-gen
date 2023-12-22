import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String s = br.readLine().trim();
      	int n = s.length();
      	if(s.charAt(n-1) == 's'){
        	s = s + 'e';
          	s = s + 's';
        }
      	else{
        	s = s + 's';
        }
      	System.out.println(s);
    }
}