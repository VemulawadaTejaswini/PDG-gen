import java.io.*;

class alphabet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader alpha = 
         new BufferedReader(new InputStreamReader(System.in));
        
        String a = alpha.readLine();

        if(a.matches("[A-Z]{1}")){
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}