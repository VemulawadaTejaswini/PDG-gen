import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class Main {
    public static void main(String[] a) throws IOException {
        //Scanner scan = new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        for(int i = 0;i <= time;i++){
            String input = br.readLine();
            System.out.println(input.replace("Hoshino","Hoshina"));
        }
    }
}