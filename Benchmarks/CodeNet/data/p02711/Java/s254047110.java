import java.io.*;

class Main
{
    public static void main(String args[])
    {
        String buf;
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        buf = br.readLine();
        char seven = '7';
        for(int i = 0; i < buf.length(); i++){
            if ( buf.charAt(i)  == seven){
                System.out.println("Yes");
                break;
            }else if( i == 2 ){
                System.out.println("No");
                break;
            }
        }
    } catch(Exception e) {}
  }
}