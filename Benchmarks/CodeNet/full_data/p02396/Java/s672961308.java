import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int n;
        while(true){
            count++;
            n=Integer.parseInt(br.readLine());
            if(n==0) break;
            System.out.println("Case "+count+": "+n);
        }
    }
}