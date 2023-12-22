import java.io.*;
import java.util.*;

public class Main {
    

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter p = new PrintWriter(System.out);
        //int T = sc.nextInt();
        //for(int x=1;x<=T;++x){
        String str=sc.next();//String s1="",s2="";boolean flag=false;
        if(str.charAt(str.length()-1)=='s'){
            System.out.println(str+"es");
        }
        else{
            System.out.println(str+"s");
        }
        
    
    }
}