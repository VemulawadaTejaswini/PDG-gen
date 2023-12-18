import java.util.*;
public class Main {
    static List<Long> list = new ArrayList<>();
    static List<Long> out = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();

        dfs(list);

        Collections.sort(out);
        
        System.out.println(out.get((int) (K-1)));
        

    }
    
    static void dfs(List<Long> list){
        //終了条件
        if(list.size()==10){
            //終了時に実施する処理はこちら
            return;
        }
        else{
        //再帰呼び出し処理 
            long from = ((list.size()==0) ? 1 : Math.max((list.get(list.size()-1)-1),0));
            long to = ((list.size()==0) ? 9 : Math.min((list.get(list.size()-1)+1),9));

            for(long i=from;i<=to;i++){
                list.add(i);
                String st="";
                for(long j=0;j<=list.size()-1;j++){
                    st = st + Long.toString(list.get((int) j));    
                }
                long k = Long.parseLong(st);
                out.add(k);
                dfs(list);
                list.remove(list.size()-1);
            }
        }
    }    
}



