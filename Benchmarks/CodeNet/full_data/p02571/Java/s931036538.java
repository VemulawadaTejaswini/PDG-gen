import java.io.*;
import java.util.*;

class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String S = br.readLine();
      	String T = br.readLine();
      	int size = T.length();
      	int ans = Integer.MAX_VALUE;
      	for(int i=0;i<=S.length()-size;i++) {
          	int tmp = i;
          	int count = 0;
         	for(int j=0;j<T.length();j++,i++) {
             	 if(S.charAt(i) != T.charAt(j))
                    count++;
            }
            if(count < ans)
            	ans = count;
          	i = tmp;
        }
        System.out.println(ans);
    }
}