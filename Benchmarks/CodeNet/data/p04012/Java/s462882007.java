import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        int cnt = 0;
        for(int i = 0;i < W.length();i++){
            for(int j = 0; j < W.length();j++){
                if(W.charAt(i) == W.charAt(j)){
                    cnt++;
                }
            }
        }
        if(cnt % 2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
