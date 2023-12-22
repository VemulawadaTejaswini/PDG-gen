import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader tate=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader yoko=new BufferedReader(new InputStreamReader(System.in));
        String tates=tate.readLine();
        String yokos=yoko.readLine();
        try{
            int a=Integer.parseInt(tates);
            int b=Integer.parseInt(yokos);
            System.out.println(a*b+" "+a*2+b*2); 
        }catch(NumberFormatException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}