import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.awt.Point;
 
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String A = a.toUpperCase();

        if(a.equals(A)){
            System.out.println("A");
        }
        else{
            System.out.println("a");
        }
    } 
}