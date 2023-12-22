import java.io.*;

public class Main{
    public static void main(String args[]){
        int a, b;
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while((line = reader.readLine()) != null) {
                String number[] = line.split(" ");
                a = Integer.parseInt(number[0]);
                b = Integer.parseInt(number[1]);
                a = a + b;
                line = Integer.toString(a);
                System.out.println(line.length());
            }
        } catch (IOException e){
            System.exit(0);
        }
    }
}