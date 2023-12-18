import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> L = new ArrayList<>();
        Map<String,Integer> Num = new HashMap<>();
        for(int i=0;i<N;i++){
            String s = sc.next();
            if(!L.contains(s)){
                L.add(s);
                Num.put(s,1);
            }
            else Num.replace(s,Num.get(s)+1);
        }
        int max = Collections.max(Num.values());
        ArrayList<String> OPT = new ArrayList<>();
        for(String s: L) if(Num.get(s)==max) OPT.add(s);
        Collections.sort(OPT);
        for(String s:OPT) System.out.println(s);
    }
}