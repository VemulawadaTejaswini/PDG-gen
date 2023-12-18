import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        char continuous_number = str.charAt(0);
        
        for(int i = 0,len = str.length(); i < len; i++){
            if(count >= 3){
                break;
            }
            // 1文字目のみ
            if(i == 0){
                count++;
                continue;
            }
            // 2文字目以降
            if(str.charAt(i) == continuous_number){
                count++;
            }else{
                continuous_number = str.charAt(i);
                count = 0;
            }
        }
        if(count >= 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }   
    }
}
