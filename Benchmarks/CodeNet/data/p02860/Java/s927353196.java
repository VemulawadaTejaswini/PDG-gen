import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] Args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String string = br.readLine();
        boolean es = true;
        if(n % 2 != 0){
            es = false;
        }
        else{
            for(int i = 0; i < n/2; i++){
                if(string.charAt(i) != string.charAt(i+ (n/2))){
                    es = false;
                }
            }
        }

        if(es){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        br.close();
    }
}