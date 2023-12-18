import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char zero = "0".charAt(0);
        String s =br.readLine(), resultado="";

        if(n == 1) {
            System.out.println("0");
        }else{
            if(s.charAt(0) != "1".charAt(0)){
                k--;
            }
            resultado += "1";
            for(int i = 1; i < n; i++){
                if(k > 0) {
                    if(s.charAt(i) != zero){
                        k--;
                    }
                    resultado += "0";
                }
                else{
                    resultado += s.substring(i);
                    break;
                }
            }
        }

        System.out.println(resultado);
        br.close();
    }
}