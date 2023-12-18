import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String op = sc.next();
        int B = sc.nextInt();
        int ans;
        if(op.chatAt(0)=='+') ans = A+B;
        else ans = A-B;
        System.out.println(ans);
    }
}
