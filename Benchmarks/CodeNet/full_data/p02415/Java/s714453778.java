import java.io.*;
import java.util.*;
 
class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c_array=br.readLine().toCharArray();
        for(char c:c_array){
            if('a'<=c&&c<='z'){ System.out.printf("%c",c-'a'+'A'); }
            else if('A'<=c&&c<='Z'){ System.out.printf("%c",c-'A'+'a'); }
            else System.out.print(c);
        }System.out.println();
    }
}
 