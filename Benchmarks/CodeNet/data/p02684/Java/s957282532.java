import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;


public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long k= Long.parseLong(sc.next());
		
		int[] aList=new int[n];
		long[] position=new long[n];
		
		for(int i=0;i<n;i++){
			aList[i]=sc.nextInt();
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		int listNum=1;
		long steps=1;
        list.add(1);
        //開始タウン
		position[0]=1;
		while(true){
            //K = 1なら即やめ
			if(steps==k){
				System.out.println(aList[listNum-1]);
            }
            //ワープ先確認
			if(position[listNum-1]>1){
                //ワープ先が来訪済み
                //最後に来訪した日を取得
                long prev=position[listNum-1];
                //
				int hoge=(int)((k-prev+1)%(steps-prev));
				int ans=list.get((int)(prev+hoge-1));
				System.out.println(ans);
				System.exit(0);
			}
			else {
                //もう来た日を記録
                position[listNum-1]=steps;
                //最新航路取得
                listNum=aList[listNum-1];
                //航路情報追加
				list.add(listNum);
				//一回移動
                steps++;
			}
		}
	}
}