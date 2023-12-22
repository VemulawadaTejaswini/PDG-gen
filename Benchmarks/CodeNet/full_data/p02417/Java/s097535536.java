import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final int[] alph = new int[26];
        String in;
        while( (in = br.readLine())!=null){
            for(int i = 0; i<in.length(); i++){
                if(Character.isUpperCase(in.charAt(i))) alph[in.charAt(i)-'A']++;
                if(Character.isLowerCase(in.charAt(i))) alph[in.charAt(i)-'a']++;
            }
        }
        for(int i = 0; i<26; i++){
            out.print((char) ('a'+i));
            out.print(" : ");
            out.println(alph[i]);
        }
        out.flush();
    }
}