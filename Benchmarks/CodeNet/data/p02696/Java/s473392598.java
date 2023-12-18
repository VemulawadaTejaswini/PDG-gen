import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        if(N>B)
            System.out.println(A-1);
        else if(Math.floorMod(N*B,A)==0){
            long temp1=(A*N/B);
            long temp2=N/B;
            System.out.println(temp1-temp2-1);
        }
        else{
            long temp1=(A*N/B);
            long temp2=N/B;
            System.out.println(temp1-temp2);
        }
    }
}