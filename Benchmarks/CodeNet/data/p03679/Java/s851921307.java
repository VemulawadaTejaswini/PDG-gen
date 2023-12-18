import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

 public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        try {
            s = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long d = Long.parseLong(s.split(" ")[0]);
        long a = Long.parseLong(s.split(" ")[1]);
        long b = Long.parseLong(s.split(" ")[2]);

        if(a >= b){
       System.out.println("delicious");
        } else if(b - a <= d){
       System.out.println("safe");
        } else {
       System.out.println("dangerous");
        }
    }
 }