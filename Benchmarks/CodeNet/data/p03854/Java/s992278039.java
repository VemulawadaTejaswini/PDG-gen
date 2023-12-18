import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
            
        String s = br.readLine();
        int n = s.length();

        while(s.length()!=0){

            if(s.startsWith("dreamera")){
            s = s.substring(5,s.length());
            }
            else if(s.startsWith("dreamer")){
                s = s.substring(7,s.length());
            }
            else if(s.startsWith("dream")){
                s = s.substring(5,s.length());
            }
            else if(s.startsWith("eraser")){
                s = s.substring(6,s.length());
            }
            else if(s.startsWith("erase")){
                s = s.substring(5,s.length());
            }
            else{
                break;
            }
        }

        if(s.length()==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
