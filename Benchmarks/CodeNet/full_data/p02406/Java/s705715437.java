import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        call(n);
    }
    
    static void call(int n){
        for(int i=0;i<=n;i++){
            if((i%3==0)||(i/10>0&&i%10==3)) System.out.print(" "+i);
        }System.out.println();
    }
}