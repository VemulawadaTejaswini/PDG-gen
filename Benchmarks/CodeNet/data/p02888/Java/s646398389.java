import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // 宣言
        Scanner sc  = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> lists = new ArrayList<>();
        // 入力値取得
        int rod = sc.nextInt();
        int lens[] = new int[rod];
        while(sc.hasNext()){
            lens[count] = sc.nextInt();
            count++;
        }
        
        
        // 組み合わせ抽出処理
        int countV =0;
        int countH =0;
        for(int i=0;i<lens.length;i++){
            for(int j=i+1;j<lens.length;j++){
                for(int k=j+1;k<lens.length;k++){
                    if( (lens[i] < (lens[j] + lens[k])) && (lens[j] < (lens[k] + lens[i])) && (lens[k] < (lens[i] + lens[j])) ){
                        lists.add(lens[i]);
                        lists.add(lens[j]);
                        lists.add(lens[k]);
                    }
                    
                }
            }
        }
        System.out.println(lists.size() / 3);
    }
}
