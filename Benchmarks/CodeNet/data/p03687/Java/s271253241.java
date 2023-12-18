import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//
        String S = new String();
        S = sc.next();

        int min = 200;
        for(int i = 0; i< S.length(); i++){
            int temp = changeNum(S, i);
            if(min > temp){
                min = temp;
            }
        }
        System.out.println(min);
    }

    //strをpos番目の文字にすべて変更する場合の回数
    private static int changeNum(String str, int pos){
        List<Integer> index = new ArrayList<>();
        for(int i =0 ;i<str.length();i++){
            if(str.charAt(i) == str.charAt(pos)){
                index.add(i);
            }
        }

        int ans = str.length() - index.get(index.size()-1);
        int temp = index.get(0) + 1;
        if (ans < temp){
            ans = temp;
        }
        for(int i=(index.size()-1); i > 0; i--){
            if(ans < (index.get(i) - index.get(i-1))){
                ans = index.get(i) - index.get(i-1);
            }
        }
        return (ans - 1);
    }
}
