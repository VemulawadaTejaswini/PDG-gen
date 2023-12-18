
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    //チェックされたら1,ベース0
    static int height[] = new int[n];
    static int road[][] = new int[m][2];

    public static void main(String[] args) {
        //高い方
        Set<String> set1 = new HashSet<String>();
        //低い方
        Set<String> set2 = new HashSet<String>();
        //選ばれてない確認
        Set<String> set3 = new HashSet<String>();
        //取得
        for (int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++){
            road[i][0] = sc.nextInt();
            road[i][1] = sc.nextInt();
            if (height[road[i][0] - 1] > height[road[i][1] - 1]){
                set1.add(String.valueOf(road[i][0]));
                set2.add(String.valueOf(road[i][1]));
            }else if (height[road[i][0] - 1] < height[road[i][1] - 1]){
                set1.add(String.valueOf(road[i][1]));
                set2.add(String.valueOf(road[i][0]));
            } else {
                set1.add(String.valueOf(road[i][1]));
                set1.add(String.valueOf(road[i][0]));
                set2.add(String.valueOf(road[i][1]));
                set2.add(String.valueOf(road[i][0]));
            }
            set3.add(String.valueOf(road[i][0]));
            set3.add(String.valueOf(road[i][1]));
        }
        Iterator ite = set2.iterator();
        while (ite.hasNext()){
            String it = (String) ite.next();
            if (set1.contains(it)){
                set1.remove(it);
            }
        }
        //1と2を比較して重複しないものと選ばれていないもの
        System.out.println(set1.size() + n - set3.size());
    }
}
