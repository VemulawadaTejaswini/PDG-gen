import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 111;
        for(int i=1;i<=9;i++){
            if(n<=i*111){
                ans = i*111;
                break;
            }
        }

        System.out.println(ans);
    }
}
