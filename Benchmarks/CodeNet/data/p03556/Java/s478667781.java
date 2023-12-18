import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1;i < n/2;i++){
            if(i*i == n){
                ans = i;
            }else if(i*i > n){
                break;
            }
        }
        System.out.println(ans);
    }
}