import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                break;
            }
            System.out.println(x);
        }
    }
}