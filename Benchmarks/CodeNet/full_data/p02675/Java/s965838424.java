import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String N = reader.readLine();
            int len = (int)N.length()-1;
            String last = N.substring(len);
            if(last.equals("3")){
                System.out.println("bon");
            }else if(last.equals("0") || last.equals("1") || last.equals("6") || last.equals("8")){
                System.out.println("pon");
            }else{
                System.out.println("hon");
            }
        }catch(IOException e){
            System.out.println("aaaa");
        }
    }
}