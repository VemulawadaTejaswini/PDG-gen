import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int A,B;
        A=sc.nextInt();
        B=sc.nextInt();
        int N = A+B;
        String [] goban = new String[N];
        System.out.println("1 "+N);
        if(A>B){
            goban[0]=".";
            for(int a=1;a<A-1;a++){
                goban[2*a] = ".";
            }
            for(int b=0;b<B;b++){
                goban[2*b+1] = "#";
            }
        }
        else{
            goban[0]="#";
            for(int a=1;a<B;a++){
                goban[2*a] = "#";
            }
            for(int b=0;b<A;b++){
                goban[2*b+1] = ".";
            }
        }
        for(int a=0;a<N;a++){
            System.out.print(goban[a]);
        }
    }
}
