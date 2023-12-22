
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    static int zeroc=0;
    public static void main(String[] args)  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
            zeroc=0;
                int in=Integer.parseInt(line);
                if(in==0)break;
                fact(in);//System.out.println("fac"+in);
                
                System.out.println(zeroc);
                
            }
        }catch(Exception e){}
        
    }
    static int fact(int in){
        if(in<4)return 0;
        zeroc+=how5((int)in);
        fact(in-1);return 0;
    }
    static int how5(int n){
        int cou=0;
        while(n%5==0){
            cou++;n/=5;
        }
        return cou;
    }
}