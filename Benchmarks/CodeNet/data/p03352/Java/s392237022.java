import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= 32; i++){
            if(i * i <= a){
                ans = i;
            }else{
                break;
            }
        }
        sc.close();
        System.out.println(ans * ans);
    }
    
}