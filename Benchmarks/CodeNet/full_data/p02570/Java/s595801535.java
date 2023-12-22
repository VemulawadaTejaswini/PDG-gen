import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        
        if(d<=t*s){
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
        
    }
}
