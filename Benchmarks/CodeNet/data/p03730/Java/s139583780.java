import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ans = "NO";
        for(int i=1;i<=105;i++){
            int cur = i*A;
            if(cur%B==C){
                ans = "YES";
                break;
            }
        }
        System.out.println(ans);
    }
}
