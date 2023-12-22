import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int[] set = new int[n];
        for(int i = 0; i < n; i++){
            int tmp = scanner.nextInt();
            set[i] = tmp-1;
        }
        int current = 0;
        int index = 0;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        while(true){
            if(visited[current] != -1){break;}
            else{
                //System.out.println(index);
                visited[current] = index; 
                current = set[current];
                index++;
            }
        }
        int head = visited[current];
        //System.out.println("head : " + head);
        int loop = index-(head%index);
        //System.out.println("loop : " + loop);
        long ans = (k - head) % (long)loop;
        System.out.println(set[(int)ans + head]+1);

    }
}

