import java.io.*;
import java.util.*;

public class FindingAWord{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        List<String> t = new ArrayList<String>();
        int num = 0;
        while(true){
            t = Arrays.asList(br.readLine().split(" "));
            for(String str: t){
                if(str == w){
                    num++;
                }
                else if(str == "END_OF_TEXT"){
                    System.out.println(num);
                    System.exit(0);
                }
            }
        }
    }
}