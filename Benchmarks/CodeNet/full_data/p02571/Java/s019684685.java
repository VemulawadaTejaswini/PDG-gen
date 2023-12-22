import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allStr = sc.next();
        String shortStr = sc.next();
        int changeCount = shortStr.length();
        //減らす文字数を増やしながら部分一致を探していく
        System.out.println("shortStr.length()="+shortStr.length());
        for(int i=0; i<shortStr.length(); i++) {
            for(int j=shortStr.length(); j>1; j--) {
                if(i>=j) {
                    continue;
                }
                String s = shortStr.substring(i, j);
                System.out.println("word="+s);
                int index = allStr.indexOf(s);
                if(index!=-1) {
                    int count = shortStr.length() - (j-i);
                    int lastcount = allStr.length() - index + shortStr.length();
                    //前後の文字数が足りるか確認
                    if(index >= i && lastcount>=0) {
                        //変更数が小さい方を保存
                            if(changeCount > count) {
                                changeCount = count;
                            }
                        }
                }
            }
        }
        System.out.println("changeCount="+changeCount);
    }
}