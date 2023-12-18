import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A=0;
        for(int i=0;i<M;i++){
        A=A+ sc.nextInt();
        }
        if((N-A)>=0)
        System.out.println(N-A);
        else
        System.out.println(-1);
    }
}