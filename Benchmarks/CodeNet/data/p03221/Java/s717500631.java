import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] p=new int[m];
        int[] y=new int[m];
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> YtoM=new HashMap<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (int i = 0; i < m; i++) {
            p[i]=sc.nextInt();
            y[i]=sc.nextInt();
            tm.put(y[i],p[i]);
            map.put(p[i],1);
            YtoM.put(y[i],i);
        }
        String[] ans=new String[m];
        for(int k:tm.keySet()){
            String left="";
            String right="";
            left=Integer.toString(tm.get(k));
            int length=left.length();
            for (int i = 0; i <6-length; i++) {
                left="0"+left;
            }
            right=Integer.toString(map.get(tm.get(k)));
            length=right.length();
            for (int i = 0; i <6-length; i++) {
                right="0"+right;
            }
            map.put(tm.get(k),map.get(tm.get(k))+1);
            ans[YtoM.get(k)]=left+right;
        }
        for (int i = 0; i < m; i++) {
            out.println(ans[i]);
        }
    }
}