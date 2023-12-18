import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max = 0, len = 0;;
        for(int i = 0; i < str.length(); i++){
            if(isATCG(str.charAt(i))){
                len++;
            } else {
                len = 0;
            }
            
            if(len > max){
                max = len;
            }
        }

        System.out.print(max);
    }

    public static boolean isATCG(char c){
        String str = "ATCG";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                return true;
            }
        }

        return false;
    }
}