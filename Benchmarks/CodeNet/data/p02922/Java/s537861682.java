import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = 0;
        int num = 0;
        if(B==1){
            System.out.println(0);
            return;
        }
        while(num<B){
            num+=A-1;
            c++;  
        }
        System.out.println(c);
    } 
}