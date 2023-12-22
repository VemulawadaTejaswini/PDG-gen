import java.util.*;

class Main{
    static int num = 200000;
    static int[] hoge = new int[num];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> human = new HashMap<>();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            int tall = sc.nextInt();
            a[i] = tall;
            if(human.containsKey(tall)){
                List<Integer> tmp = human.get(tall);
                tmp.add(i);
                human.put(tall, tmp);
            }
            else{
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                human.put(tall, tmp);
            }
        }

        int count = 0;
        for(int i=1;i<=n;i++){
            for(Integer t : human.keySet()){
                int target_n = i+t+a[i];
                if(human.get(t).contains(target_n))count++;
            }
        }
        System.out.println(count);

    }
}
