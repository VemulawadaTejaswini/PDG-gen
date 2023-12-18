
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String[] ss=br.readLine().split(" ");
               int n=Integer.parseInt(ss[0]);
               int m=Integer.parseInt(ss[1]);
               System.out.println((n*(n-1))/2 + m*(m-1)/2);



        }catch(Exception e){
            System.out.println("kkkk");
        }
    }
    static class pair{
        int a,b;
        public pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}