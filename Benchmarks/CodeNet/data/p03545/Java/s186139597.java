import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = N/1000;
        int B = (N/100)%10;
        int C = (N/10)%10;
        int D = N%10;
        
        if(A+B+C+D==7){
        	System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
        }else if(A+B+C-D==7){
        	System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
        }else if(A+B-C+D==7){
        	System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
        }else if(A+B-C-D==7){
        	System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
        }else if(A-B+C+D==7){
        	System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
        }else if(A-B+C-D==7){
        	System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
        }else if(A-B-C+D==7){
        	System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
        }else if(A-B-C-D==7){
        	System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
        }
    }
}