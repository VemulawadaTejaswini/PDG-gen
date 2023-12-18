import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans =0;
        Map<String, List<Integer>> m = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String iStr = i+"";
            String a = iStr.substring(0,1);
            String b = iStr.substring(iStr.length()-1);
            String ab = a+b ;
            String ba = b+a ;
            if(!m.containsKey(ab)){
                m.put(ab,new ArrayList<>());
            }
            m.get(ab).add(i);
            if(m.containsKey(ba)){
                if(a.equals(b)){
                    ans+=m.get(ba).size() * 2 -1;
                }else{
                    ans+=m.get(ba).size() * 2;
                }

            }
        }
        System.out.println(ans);
    }
}