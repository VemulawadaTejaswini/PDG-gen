import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=scan.nextInt();
        
        long max=-1000000, min=1000000, sum=0;
        for(int j=0;j<i;j++){
            long x=scan.nextLong();
            sum=sum+x;
            if(x>man) {main=x;}
            if(x<min) {min=x;}
        }
        System.out.prinln(min+" "+max+" ""+sum);
    }
}