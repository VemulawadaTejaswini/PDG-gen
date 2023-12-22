import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().trim();
        long res=0;
        for(int i=0;i<s.length();i++){
            res+=(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        if(res%9==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }





    }







}
