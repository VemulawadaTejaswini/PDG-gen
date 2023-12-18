import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = a + b + c;
        if(a>=22){
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    } 
}