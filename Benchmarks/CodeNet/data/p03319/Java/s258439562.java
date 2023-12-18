import java.util;
public class Main{

    public static void main(String[] args){
        int i;
        List<int> list = new ArrayList<int>();
        for(i = 3;i - 2 < args[0];i++)
        list.add(args[i]);
		    int min = List.get(0);	　　//とりあえず最小値をn[0]に設定して変数minに代入
		    for (int j=0; j < List.size(); j++) {
			       if (min > List.get(j)) {	//現在の最小値よりも小さい値が出たら
				           min = List.get(j);	//変数minに値を入れ替える
			       }
		    }
        int count = 0;
        for(j = 0;j < n;j++){
            if(List.get(j) == min){
                count++;
            }
        }
        int ans = (args[0] - count) / args[2];
        System.out.println(ans);
    }

}
