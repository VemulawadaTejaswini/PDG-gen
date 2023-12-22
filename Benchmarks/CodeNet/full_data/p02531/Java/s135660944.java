import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        ArrayList<Character> li = new ArrayList<Character>();

        while(true){
            String[] str = in.readLine().split(" ");
            if     (str[0].equals("push") == true){
                li.add(str[1].charAt(0));
            }
            else if(str[0].equals("pop")  == true){
                sb.append(li.get(li.size() - 1) + "\n");
                li.remove(li.size() - 1);
            }
            else break;
        }

        System.out.print(sb);
        in.close();
    }
}