import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("");
        int count = 0;
        int countStart = 0;
        
        //文字列を一文字ずつ取り出し、条件に合えばカウント
        //条件に合わないときは何もしない
        for (int i = 0; i < str.length; ++i){
            if (str[i].equals("A")){    //カウントの始まり
                countStart = 1;
            }
            if (start == 1){  //部分文字列のカウント
                ++count;
                if (str[i].equals("Z")){  //カウントの終わり
                    System.out.println(count);
                    break;	//Zにたどり着いた段階で、部分文字列の長さを表示して終了
                }
            }
        }
        
    }
}