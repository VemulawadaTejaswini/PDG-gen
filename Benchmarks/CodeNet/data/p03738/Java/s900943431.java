import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        if(a.length > b.length){
            System.out.println("GREATER");
            return;
        }else if(a.length < b.length){
            System.out.println("LESS");
            return;
        }else{
            for(int i = 0; i < a.length; i++){
                if(a[i] > b[i]){
                    System.out.println("GREATER");
                    return;
                }else if(a[i] < b[i]){
                    System.out.println("LESS");
                    return;
                }
            }
        }
        System.out.println("EQUAL");
    }
}