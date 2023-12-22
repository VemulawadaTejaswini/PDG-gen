import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String line = br.readLine();
        char[] str = new char[line.length()];
        char c;
        for(int i = 0; i < line.length(); i++){
            c = line.charAt(i);
            if(c >= 65 && c <= 90){ c += 32; }
            else if(c >= 97 && c <= 122){ c -= 32; }
            str[i] = c;
        }
        String newline = new String(str);
        System.out.println(newline);
    }
}
