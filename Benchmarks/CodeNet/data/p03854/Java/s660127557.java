import java.util.*;

public class Main {
    public static void main(String[] args) {
        String res = "NO";
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        String[] words = {"maerd","remaerd","ecare","recare"};
        String judgeString = "";
        StringBuilder sb = new StringBuilder();
        String rS = sb.append(S).reverse().toString();

        String T = "";

        for(int i = 0; i < rS.length(); i++){
            judgeString = judgeString + String.valueOf(rS.charAt(i));
            for (String word : words) {
                if(word.equals(judgeString)){
                    T = T + word;
                    judgeString = "";
                    break;
                }
            }                
            if(T.equals(rS)){
                res = "YES";
                break;
            }
        }
        
        System.out.println(res);
    }
}