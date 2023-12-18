import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ans = "NO";
        if(C>=A&&C%A==0) ans = "YES";

        System.out.println(ans);
    }
}
 