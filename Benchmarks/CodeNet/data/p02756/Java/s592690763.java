import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.next());
        int n = sc.nextInt();
        boolean ret = false;
        for(int i = 0; i < n; i++){
            int q = sc.nextInt();
            if(q == 1){
                if(ret){
                    ret = false;
                }else{
                    ret = true;
                }
            }else{
                int q2 = sc.nextInt();
                if(q2 == 1 && !ret || q2 == 2 && ret){
                    str.insert(0,sc.next());
                }else{
                    str.append(sc.next());
                }
            }
        }
        if(ret){
            System.out.println(str.reverse().toString());
        }else{
            System.out.println(str.toString());
        }
        
    }
}
