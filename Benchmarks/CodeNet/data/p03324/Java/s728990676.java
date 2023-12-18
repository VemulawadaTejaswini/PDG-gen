import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        switch(d){
            case 0:
                ans = n;
                System.out.println(ans);
                break;
            case 1:
                if(n == 100){
                    ans = 9900;
                }else{
                    ans = 100*n;
                }
                System.out.println(ans);
                break;
            case 2:
                if(n == 100){
                    ans = 990000;
                }else{
                    ans = 10000*n;
                }
                System.out.println(ans);
                break;
        }
            
    }
}