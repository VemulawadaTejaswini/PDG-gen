import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int cnt = 0;

        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            if(i == 0){
                max = num;
            }else{
                if(max <= num){
                    max = num;
                }else{
                    cnt++;
                }
            }
        }
        System.out.println(cnt <= 1?"YES":"NO");
    }
}