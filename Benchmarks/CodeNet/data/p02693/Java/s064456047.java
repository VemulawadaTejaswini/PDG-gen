import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if((B-A+1)>=N)
            System.out.println("OK");
        else
            System.out.println("NG");
    }
}