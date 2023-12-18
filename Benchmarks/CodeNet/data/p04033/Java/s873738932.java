import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int a = Integer.parseInt(in1[0]);
        int b = Integer.parseInt(in1[1]);
        br.close();

        if(a <= 0 && b >= 0){
            System.out.println("Zero");
        }else if(a > 0){
            System.out.println("Positive");
        }else if((b - a) % 2 == 1){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}