import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N/100;
        int b = N%10;
        String ans = "No";
        if(a==b) ans = "Yes";
        System.out.println(ans);
    }
}
