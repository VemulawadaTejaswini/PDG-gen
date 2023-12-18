import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int N=stdIn.nextInt();
        int A=stdIn.nextInt();
        int B=stdIn.nextInt();

        
        int tt=(N-2)*(B-A)+1;
        if(tt<0){
            System.out.println(0);
        }else{
            System.out.println(tt);
        }
    }
}