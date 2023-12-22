import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException{
        Scanner br = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
 
        int[] alp = new int[26];
 
        while (br.hasNext()) {
            String line = br.nextLine();
            line = line.toLowerCase();
            char[] c = line.toCharArray();
            for (int i=0; i<c.length; i++) {
                if (c[i] >= 'a' && c[i] <= 'z')
                    alp[c[i]-'a']++;
            }
        }
 
        for (int i=0; i<26; i++) {
            System.out.println((char)('a'+i)+" : "+alp[i]);
        }
 
        br.close();
    }
}