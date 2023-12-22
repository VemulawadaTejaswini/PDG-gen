import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    for(int i=1;;i++){
        String x=buf.readLine();
        if(x.equals("0")){
            break;
        }
            System.out.print("Case "+i+": "+x);
        }
    }
}