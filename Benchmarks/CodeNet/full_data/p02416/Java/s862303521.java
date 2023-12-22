import java.io.*;

public class Main {
    public static void main(String[] arg){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
            String line = reader.readLine();
            if(line.equals("0")) break;
            int b = 0;
            for(int i=0;i<line.length();i++){
            int a = line.charAt(i)-'0';
            b = b + a;
            }
            System.out.println(b);
        }
            } catch (IOException e){
                System.out.println("e");
            }
        }
    }
