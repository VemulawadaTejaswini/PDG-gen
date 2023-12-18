import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{    
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int a=s.nextInt(),b=s.nextInt(),x=s.nextInt();
         double y=(double)2*(a*a*b-x);
        // System.out.println(y);
         double xx=(double)a*a*a;
         y=(double)y/xx;
         //System.out.println(y);
        //Set<Integer>ss=new HashSet<>();
         ///y=Math.atan(y);
         //System.out.println(y);
         y=Math.toDegrees(Math.atan(y));;
         /*if(res==(long)1e9+7){
            System.out.println(n-1);
         }
         else{
            System.out.println(res);
         }*/
        System.out.println(y);
    }
}