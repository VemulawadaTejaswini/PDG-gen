import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        int ans;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int now = a + b + c;
        int max3 = a * 3;
        if(max3 < b * 3){
            max3 = b * 3;
        }
        if(max3 < c * 3){
            max3 = c * 3;
        }
        if((max3 - now) % 2 == 0){
            ans = (max3 - now)/2;
        }else{
            ans = (max3 - now)/2 + 2;
        }
        System.out.println(ans);
        sc.close();
    }

}