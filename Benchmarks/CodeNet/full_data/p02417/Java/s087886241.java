import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String str = br.readLine();
        int[] numOfLetter = new int[26];
        int i; char c;
        for(i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if('a' <= c && c <= 'z'){ numOfLetter[c - 'a']++; }
            else if('A' <= c && c <= 'Z'){ numOfLetter[c - 'A']++; }
        }
        c = 'a';
        for(i = 0; i < 26; i++, c++){
            System.out.print(c);
            System.out.println(" : " + numOfLetter[i]);
        }
    }
}
