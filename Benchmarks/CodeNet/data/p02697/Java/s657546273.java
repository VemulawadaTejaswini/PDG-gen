import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        if( N % 2 == 1){
            for(int i=0; i<M; i++){
                p((i+1)+" "+(N - i -1) );
            }
        }
        else{
            for(int i=0; i<M; i++){
                p((i+1)+" "+(N - i) );
            }
        }
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
