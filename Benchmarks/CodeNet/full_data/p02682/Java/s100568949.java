import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if(K<=A)
            System.out.println(K);
        else if(K<=(A+B))
            System.out.println(A);
        else
            System.out.println(2*A-K+B);
    }
}