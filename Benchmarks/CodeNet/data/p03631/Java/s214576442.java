import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String num = new StringBuffer(n).reverse().toString();
        System.out.println(n.equals(num)?"Yes" : "No");
    } 
}