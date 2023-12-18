import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        if(h % a != 0){
            System.out.println(h/a+1);
        }else{
            System.out.println(h/a);
        }
    }
}