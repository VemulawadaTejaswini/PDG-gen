import java.io*;
import java.util.*;

public class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	int ans = 0, i = 0;
      	while(i <= N) {
         	String tmp = "" + i;
          	boolean flag = true;
          	for(int j = 0;j<tmp.length();j++) {
             	char ch = tmp.charAt(j);
              	if(j != '7' && j != '5' && j != '3') {
                 	flag = false;
                  	break;
                }
            }
          	if(flag) 
              ans++;
        }
      	System.out.println(ans);
    }
}