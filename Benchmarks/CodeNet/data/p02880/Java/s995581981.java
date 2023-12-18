import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{    
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt();
         if(n>81){
            System.out.println("NO");
         }
         else{
            int tmp=1;
            for(int i=1;i<=9;i++){
                if(n%i==0){
                    if(n/i <=9){
                System.out.println("YES");break;
            }
                }
            }
            
            
                System.out.println("NO");
            
         }
         
       // System.out.println(sb);
    }
}