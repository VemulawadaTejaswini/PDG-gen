import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int length;
        int sh;
        int a;
        StringBuffer sb = new StringBuffer();
        while(true){
            String str = in.readLine();
            if(str.equals("-") == true) break;
            length = Integer.parseInt(in.readLine());
            sh = 0;
            for(int i=0; i<length; i++){
                sh += Integer.parseInt(in.readLine());
            }
            for(int i=0; i<str.length(); i++){
                a = (sh + i) % str.length();
                sb.append(str.charAt(a));
            }
            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}