import java.util.HashMap;
import java.util.*;
import java.util.Scanner;


public class C {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map <Integer,Integer> lightMap = new HashMap<>();
        Set<Integer> removeSet = new HashSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){//n回繰り返し
            int lightNum = i + 1;
            int lightHeight = sc.nextInt();
            lightMap.put(lightNum,lightHeight); //灯台番号と高さの入ったリスト作る
        }

        for(int i = 0; i < m;i++){ //m回繰り返し
            int a = sc.nextInt();
            int b = sc.nextInt(); //道の両サイドの灯台のkey
            int aHeight = lightMap.get(a);
            int bHeight = lightMap.get(b);

            if(aHeight < bHeight){//高さが低い方をリストに入れる（良い展望台ではない）
                removeSet.add(a);
            }else if(aHeight > bHeight){
                removeSet.add(b);
            }else{
                removeSet.add(a);
                removeSet.add(b);
            }
        }
        System.out.print(n - removeSet.size());
    }
}
