import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;


public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        final int M = Integer.parseInt(s.next());
        final int X = Integer.parseInt(s.next());
        //final HashSet<Integer> bookInfo= new HashSet<Integer>();
        final HashMap<Integer,ArrayList<Integer>> bookList= new HashMap<Integer,ArrayList<Integer>>();
       for(int i = 0;i<N;i++){
        ArrayList<Integer> bookInfo= new ArrayList<Integer>();
            for( int i2=0; i2<M+1; i2++){
                bookInfo.add(Integer.parseInt(s.next()));
            } 
        bookList.put(i,bookInfo);
       }
       long price =-1;
       //ビット全検索
       for(int Mnum=0;Mnum<(1<<N);Mnum++){
           int tmpPrice = 0;
           int testFirst =0;
           ArrayList<Integer> targetBookInfo;
            for (int j=0; j<N; j++) {
                //ビットが１かの確認
                if ((1 & Mnum>>j) == 1) {
                        //アルゴリズムA1の習熟度だけ調査
                        targetBookInfo = bookList.get(j);
                        Iterator<Integer> hoge = targetBookInfo.iterator();
                        tmpPrice += hoge.next();
                        testFirst += hoge.next();
                };
            }
            //A1の習熟度が十分な場合,あと安いとき.本格的な計算
            if(testFirst >= X ){
                boolean Hoge = false;
                int argoChecker=0;
                //一つの学習度に着目して
                for(int targetArgo = 2;targetArgo <M;targetArgo++){
                    //bitが１かの確認
                    for (int j=0; j<N; j++) {
                        if ((1 & Mnum>>j) == 1) {
                            argoChecker += bookList.get(j).get(targetArgo);
                        }
                    }
                    //学習度がXを超えてるかの確認
                    if(argoChecker <X){
                        argoChecker=0;
                        Hoge = true;
                        break;
                    }else{
                        argoChecker=0;
                    }
                }
                //無事全条件をクリアしたので更新
                if(tmpPrice<price && Hoge ==false){
                    price = tmpPrice;
                }
            }
        }
    System.out.println(price);
    }
}