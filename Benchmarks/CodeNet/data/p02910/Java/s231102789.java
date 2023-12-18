import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

      	String sc = s.next();
        HashMap<String, String> wether = new HashMap<String, String>();

        // まずstrArraySubに1文字多い配列を作る
        String[] strArraySub = sc.split("");
        
        String[] strArray = new String[sc.length()];
        
        // 変数の長さ分回す
        for (int i = 0; i < sc.length(); i++) {
            // 配列に順番に格納する
            strArray[i] = String.valueOf(sc.charAt(i));
        }
       
        boolean flag = false;

        for (int i = 0; i < strArray.length; i++) {
            if(i%2 == 0){
                if(strArray[i] == "R") {
                    flag = true;
                    break;
                }
            } else {
                if(strArray[i] == "L") {
                    flag = true;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}