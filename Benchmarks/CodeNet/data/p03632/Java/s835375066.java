import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int a = scan_A.nextInt();
        int b = scan_A.nextInt();
        int c = scan_A.nextInt();
        int d = scan_A.nextInt();
        int ans =0;
        if(b < c){
            ans = 0;
            System.out.println(ans);
        }else{
            if(a<c && b<d){
                ans = b-c;
            }else if(c<a && b<d){
                ans = b-a;
            }else if(a<c && d<b){
                ans = d-c;
            }else if(c<a && d<b){
                ans = d-a;
            }
            
            System.out.println(ans);
        }
        
    }

}