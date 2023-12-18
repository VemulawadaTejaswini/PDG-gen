import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> D = new HashMap<String, Integer>();
        for (int i=0; i<N; i++){
            String S = sc.nextLine();
            if (D.get(S) == null){
                D.put(S, 1);
            }else{
                D.put(S, D.get(S)+1);
            }
        }
        Integer maxPoll = 0;
        for (int v: D.values()){
            maxPoll = Math.max(maxPoll, v);
        }
        
        List<String> res = new ArrayList<String>();
        for (String k: D.keySet()){
            if (D.get(k) == maxPoll){
                res.add(k);
            }
        }
        Collections.sort(res);
        for (String r: res){
            System.out.println(r);
        }
    }
}

