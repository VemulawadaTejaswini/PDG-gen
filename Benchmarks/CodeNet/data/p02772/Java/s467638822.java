import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean chk = true;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            if(tmp % 2 == 0 && tmp % 3 != 0 && tmp % 5 != 0){
                chk = false;
                break;
            }
        }
        if(chk){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}