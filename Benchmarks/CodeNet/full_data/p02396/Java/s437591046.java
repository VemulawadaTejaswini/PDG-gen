import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    int i=1;
    do{
        String x=buf.readLine();
        if(x.equals("0"))
            break;
            System.out.print("Case "+i+": "+x);
            i++;
        }while(i<10001);
    }
}