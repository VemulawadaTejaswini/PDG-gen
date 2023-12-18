import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        
        int Sum = 0;
        if(A>B){
            Sum = Sum + B;
        }else if(A == B){
            Sum = Sum +A;
        }else if(A<B){
            Sum = Sum + A;
        }
        if(C>D){
            Sum = Sum + D;
        }else if(C == D){
            Sum = Sum + C;
        }else if(C<D){
            Sum = Sum + C;
        }
        System.out.println(Sum);
    }
}