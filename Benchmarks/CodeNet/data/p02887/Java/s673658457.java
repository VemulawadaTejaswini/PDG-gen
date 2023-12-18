import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int N = sc.nextInt();
        String S = sc.next();
        
        // リストを作る
        List<String> list = new ArrayList<String>();
        
        // 変数strの長さ分回す
        for (int i = 0; i < S.length(); i++) {
            // Sの先頭から1文字ずつString型にして取り出す
            String str = String.valueOf(S.charAt(i));
            // リストに順番に格納する
            list.add(str);
        }
        
        // 配列を回しながら隣と同じだったら消す
        for (int i = 0; i < list.size(); i++) {
            
            if(list.get(i).equals(list.get(i+1))){
                list.remove(list.get(i));
            }
        }      

        System.out.println(list.size());

        
    }
}