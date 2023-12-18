import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        if(X < A){
            X=0;
        }
        else{
            X=10;
        }
        System.out.println(X);
    }
}