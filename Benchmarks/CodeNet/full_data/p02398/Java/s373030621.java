import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] lines=br.readLine().split(" ");
        int a=Integer.parseInt(lines[0]);
        int b=Integer.parseInt(lines[1]);
        int c=Integer.parseInt(lines[2]);
        int count=0;
        for(int i=a;i<=b;i++){
            if(c%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}