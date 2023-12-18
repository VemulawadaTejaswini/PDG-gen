import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        Map<Long,Long> set = new HashMap<>();
        for(long i = 0; i < n; i++){
            long tmp = scanner.nextLong();
            set.put(i, tmp-1);
        }
        List<Long> visited = new ArrayList<>();
        long current = 0;
        while(true){
            if(visited.contains(current)){break;}
            else{
                visited.add(current);
                current = set.get(current);
            }
        }
        long head = visited.indexOf(current);
        long loop = visited.size()-(head%visited.size());
        long ans = (k - head) % loop;
        System.out.println(set.get(ans + head)+1);

    }
}

