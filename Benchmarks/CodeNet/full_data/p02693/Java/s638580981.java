import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;

public class Solution {

    //private static Object InputStream;

    public static void main(String args[]) throws IOException {
        // Object input;
       Scanner scan=new Scanner(System.in);
       int K=scan.nextInt();
        int A=scan.nextInt();
        int B=scan.nextInt();
        boolean t=true;
      for(int i=A;i<=B;i++){
          if(i%K==0){
              t=false;
              break;
          }
      }
        if(t){
            System.out.println("NG");
        }
        else{
            System.out.println("OK");
        }
    }

}
