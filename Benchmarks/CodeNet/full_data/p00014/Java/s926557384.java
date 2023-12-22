import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
    int d,sum;
    void run() throws Exception {
        while(cin.hasNext()){
          d=cin.nextInt();
          sum=0;
          for(int i=d;i<=600;i+=d){
        	  sum+=d*(i-d)*(i-d);
          }
          System.out.println(sum);
        }
    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    } 
    Scanner cin = new Scanner(new BufferedInputStream(System.in));
    
//    BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
}