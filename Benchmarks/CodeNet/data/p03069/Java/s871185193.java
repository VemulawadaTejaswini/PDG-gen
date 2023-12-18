import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;

        String[] strArray = new String[N];
        for (int i = 0; i < S.length(); i++) {
            // 配列に順番に格納する
            strArray[i] = String.valueOf(S.charAt(i));
        }

        for (int i = 0; i < (S.length() - 1); i++) {
            if(strArray[i].equals("#")){
               if(strArray[i+1].equals(".")){
                        strArray[i] = ".";
                        count = count + 1;
                 }
             }
        }
        

        System.out.println(count);





    }
}