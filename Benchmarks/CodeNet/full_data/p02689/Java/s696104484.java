import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n+1];
        int[] h_res = new int[n+1];
        List<List<Integer>> route = new ArrayList<>();
        route.add(new ArrayList<Integer>());
        for(int i=1;i<=n;i++){
            h[i] = sc.nextInt();
            route.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            List<Integer> tmp = route.get(a);
            tmp.add(b);
            route.add(tmp);
            List<Integer> tmp2 = route.get(b);
            tmp2.add(a);
            route.add(tmp);
        }

        int count = 0;

        for(int i=1;i<=n;i++){
            boolean flag = true;
            int height = h[i];
            for(Integer nei : route.get(i)){
                if(height<=h[nei]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

        System.out.println(count);
    }
}
