import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer,Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for(int i = 0;i<n;i++){
            sc.next();
            int tmp = Integer.parseInt(sc.next());
            al.add(tmp);
            hm.put(tmp,i);
        }
        List<Integer> al2 = new ArrayList<>();
        al2.addAll(al);
        Collections.sort(al);
        Collections.reverse(al);
        int i = 0;
        for(int data:al){
            i += 1;
            hm.put(data,i);
        }
        for(int data:al2){
            System.out.println(hm.get(data));
        }
    }
}