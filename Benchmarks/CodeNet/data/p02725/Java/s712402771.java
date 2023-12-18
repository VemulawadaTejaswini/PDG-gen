import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        long ans = Integer.MAX_VALUE;
        int start = 0;
        long min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            int dis = sc.nextInt();
            list.add(dis);
        }
        list.addAll(list);
        for(int i = 0;i<n;i++){
            long distance = 0;
            start = i;
            for(int j = 0;j < n-1;j++){
                if(start == n-1){
                    distance += k-list.get(start)+list.get(start+1);
                }else{
                    distance += list.get(start+1)-list.get(start);
                }
                
                start++;
            }
            ans = (long)(Math.min(distance,ans));
        }

        System.out.println(ans);
    }
}