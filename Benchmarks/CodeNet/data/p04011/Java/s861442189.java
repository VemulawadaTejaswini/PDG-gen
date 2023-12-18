import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //宿泊数
        int k = scan.nextInt(); //料金プラン切替日
        int x = scan.nextInt(); //前半料金
        int y = scan.nextInt(); //後半料金
        
        int ryokin = 0;
        
        if(n > k){
            ryokin = x * k + y * (n -k);
        }
        else{
            ryokin = x * k;
        }
        System.out.println(ryokin);
    }
}