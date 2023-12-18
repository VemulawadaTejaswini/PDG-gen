import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    ArrayList<Long> As = new ArrayList<Long>();
    HashMap<Long,Long> hm = new HashMap<>();
    for(int i = 0;i < N;i++) {
        Long a = sc.nextLong();
        Long count = hm.containsKey(a) ? hm.get(a) : new Long("0");
        hm.put(a,count + 1);
    }

    long count = 0;
    for(Long k: hm.keySet()){
        if(hm.get(k) % 2 != 0)
            count += 1;
    }

    System.out.println(count);

    }










    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}
