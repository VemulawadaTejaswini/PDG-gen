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

            if(i<0){
                if(strArray[i-1].equals("#")){
                    if(strArray[i].equals(".")){
                        strArray[i] = "#";
                        count ++;
                    }
                }
            }
        }

        System.out.println(count);





    }
}