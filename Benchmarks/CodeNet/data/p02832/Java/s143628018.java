import java.util.*;
import java.util.List;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        for(int i = 0; i < n; i++){
            a += sc.next() + " ";
        }
        
        int ans = 0;
        int stt = 0;
        for(int i = 1; i < n+1; i++){
            int index = a.indexOf(String.valueOf(i),stt);
            if(index == -1){
                break;
            }
            stt = index+1;
            //System.out.println(a + " " + index + " " + stt);
            ans++;
        }
        if(ans == 0){
            System.out.println(-1);
        }else{
            System.out.println(n-ans);
        }
    }
}

