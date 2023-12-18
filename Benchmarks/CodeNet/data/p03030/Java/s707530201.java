import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<String,Integer> hm = new HashMap<>();
        List<String> al = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String tmp = sc.next();
            int tmp2 = Math.abs(Integer.parseInt(sc.next()) - 100);
            tmp = tmp + String.valueOf(tmp2);
            System.out.println(tmp);
            al.add(tmp);
            hm.put(tmp,i);
        }
        List<String> al2 = new ArrayList<>();
        al2.addAll(al);
        Collections.sort(al);
        for(String data:al){
            System.out.println(1 + hm.get(data));
        }
    }
}