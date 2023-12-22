import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = 'a';
        for(int i = 0; i < 26; i++){
            int count = 0;
            for(char x: str.toCharArray()){
                if(x == (char)(c + i) || x == (char)(c + i - 32)){
                    count++;
                }
            }
            System.out.println((char)(c + i) + " : " + count);
        }
        
    }
}
