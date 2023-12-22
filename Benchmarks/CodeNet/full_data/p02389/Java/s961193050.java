import java.io.*;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            String str[] = line.split(" ",0);
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(a*b + " " + (a+b)*2);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
