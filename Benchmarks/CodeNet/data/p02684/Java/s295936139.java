import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        Map<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            set.put(i, tmp-1);
        }
        List<Integer> visited = new ArrayList<>();
        int current = 0;
        while(true){
            if(visited.contains(current)){break;}
            else{
                visited.add(current);
                current = set.get(current);
            }
        }
        int head = visited.indexOf(current);
        int loop = visited.size()-(head%visited.size());
        //System.out.println(loop);
        long ans = (k - head) % loop;
        //System.out.println(ans);
        //System.out.println(set.get((int)ans));
        System.out.println(set.get((int)ans + head)+1);

    }
}
