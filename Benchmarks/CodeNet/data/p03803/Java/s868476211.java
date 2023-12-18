import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ans = "Alice";
        if(A==B) ans = "Draw";
        if(A!=1&&A<B) ans = "Bob";
        if(B==1) ans = "Bob";
        System.out.println(ans);
    }
}
