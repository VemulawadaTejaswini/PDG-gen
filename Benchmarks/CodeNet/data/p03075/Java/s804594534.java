// proxy

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();
        antena(a,e,k);
        
    }
    
    public static void antena(int a,int e,int k){
        if( e - a > k){
            System.out.println(":)");
        } else {
            System.out.println("Yay!");
        }
    }
}