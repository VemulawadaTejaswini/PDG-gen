import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int q = Integer.parseInt(input.readLine());
        StringBuffer sb = new StringBuffer(s);

        for(int i=0;i<q;i++){
            String[] qn = input.readLine().split(" ");
            if(qn.length == 1){
                sb.reverse();
            }else{
                if(qn[1].equals("1")){
                    sb.insert(0,qn[2]).toString();
                }else if(qn[1].equals("2")){
                    sb.append(qn[2]).toString();
                }
            }
        
        }
        System.out.println(sb.toString());
    }
}
