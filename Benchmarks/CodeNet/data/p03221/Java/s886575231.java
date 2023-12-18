import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, ArrayList> mapList = new HashMap<Integer, ArrayList>();
        int[][] valAry = new int[M][2];

        for(int i = 0; i < M ; i++){
            int P = sc.nextInt();
            int Y = sc.nextInt();
            valAry[i][0] = P;
            valAry[i][1] = Y;
            ArrayList list = mapList.containsKey(P) ? mapList.get(P) : new ArrayList();
            list.add(Y);
            mapList.put(P, list);
        }
        Iterator<Entry<Integer, ArrayList>> it = mapList.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList list = it.next().getValue();
            Collections.sort(list);
        }
        for(int i = 0; i < M ; i++){
            System.out.println(format(valAry[i][0])+format(mapList.get(valAry[i][0]).indexOf(valAry[i][1])+1));
        }
    }

    public static String format(int val){
        if(val > 99999) return "" + val;
        else if(val > 9999) return "0" + val;
        else if(val > 999) return "00" + val;
        else if(val > 99) return "000" + val;
        else if(val > 9) return "0000" + val;
        else if(val > 0) return "00000" + val;
        else return "";
    }
}