

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long mod = (b-a+1)%4;
        if(a%2==0){
            if(mod==0){
                System.out.println(0);
            }else if(mod==1){
                System.out.println(b);
            }else if(mod ==2){
                System.out.println(1);
            }else{
                System.out.println(1^b);
            }
        }else{
            if(mod==0){
                System.out.println(a^1^b);
            }else if(mod==1){
                System.out.println(a);
            }else if(mod ==2){
                System.out.println(a^b);
            }else{
                System.out.println(a^1);
            }
        }
    }
    
}