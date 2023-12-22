import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();
        if(b > (m + f)){
            System.out.println("NA");
        }else{
            if(b > m){
                System.out.println(b-m);
            }else{
                System.out.println(0);
            }
        }
    }
}
