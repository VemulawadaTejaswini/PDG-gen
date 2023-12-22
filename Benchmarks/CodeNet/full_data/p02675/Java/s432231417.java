
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        int k=n%10;
        if(k==2 || k==4 || k==5 || k==7 || k==9)
            System.out.println("hon");
        else if(k==3)
            System.out.println("bon");
        else
            System.out.println("pon");
    }
}
