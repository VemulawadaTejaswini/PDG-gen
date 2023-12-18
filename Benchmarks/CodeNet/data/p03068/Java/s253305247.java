import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();

        String[] strArray = new String[a];
        
        //String str = "abc";
        //System.out.println(str.charAt(1));  //結果は"b"となる


        for (int i = 0; i < b.length(); i++) {
            // 配列に順番に格納する
            strArray[i] = String.valueOf(b.charAt(i));
        }

        int g = (c-1);

        String d = strArray[g];

        for(int j = 0; j < b.length(); j++){
            if(strArray[j] == d){
                continue;
            }else{
                strArray[j] = "*";
            }
        }

        for(int k = 0; k < b.length(); k++){
            System.out.println(strArray[k]);
        }







        

       

    }
}