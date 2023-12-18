import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int h = scanner.nextInt();
            map.put(i+1,h);
        }
        boolean[] nongood = new boolean[n+1];
        for(int i = 0; i < m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(map.get(a) > map.get(b)){
                nongood[b] = true;
            }else if(map.get(a) < map.get(b)){
                nongood[a] = true;
            }else{
                nongood[b] = true;
                nongood[a] = true;
            }
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(!nongood[i]){count++;}
        }
        System.out.println(count);
    }
}

