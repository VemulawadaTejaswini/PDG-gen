import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int cnt = 0;

        for(int i = 0;i < n-1;i++){
            char info1 = s.charAt(i);
            for(int j = i+1;j < n;j++){
                char info2 = s.charAt(j);
                if(info1 != info2){
                    break;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}