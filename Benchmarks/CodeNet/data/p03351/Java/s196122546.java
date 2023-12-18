import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        if(a > c){
            
        }else if(a < c){
            
        }
        if(Math.abs(a - c) <= d){
            System.out.println("Yes");
        }else if((Math.abs(a - b) <= d) && (Math.abs(c - b) <= d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}