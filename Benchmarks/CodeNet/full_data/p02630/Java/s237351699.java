 import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();

        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }
        
        int q = sc.nextInt();

        for(int i = 0;i < q;i++){
            long sum = 0L;
            int data = sc.nextInt();
            int change = sc.nextInt();
            for(int j = 0;j < list.size();j++){
                if(list.get(j) == data){
                    list.set(j,change);
                }
                sum += list.get(j);
            }
            list2.add(sum);
        }
        for(long ans : list2){
            System.out.println(ans);
        }
    }
}