import java.util.*;

public class Main {

    static int bfs(int src,LinkedList<Integer>[] friend,LinkedList<Integer>[] enemy){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(src);
        int count=0;
        int j=0;
        while (!queue.isEmpty()){

            int temp = queue.poll();

            for(Integer i:friend[temp]){
                if(!hashSet.contains(i) && !enemy[temp].contains(i)) {
                    queue.add(i);
                    hashSet.add(i);
                    if(!enemy[src].contains(i) && j>0){
                        count++;
                    }
                }
            }
            j++;
        }
            return count;
    }

    public static void main(String[] args) {

        int n,m,k;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        k=scanner.nextInt();
        LinkedList<Integer>[] friends=new LinkedList[n+1];
        LinkedList<Integer>[] enemy=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            friends[j]=new LinkedList<>();
            enemy[j]=new LinkedList<>();
        }
        for(int j=0;j<m;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            friends[a].add(b);
            friends[b].add(a);
        }
        for(int j=0;j<k;j++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            enemy[a].add(b);
            enemy[b].add(a);
        }
//        int[] ans=new int[n];
        for(int j=0;j<n;j++){
            System.out.print(bfs(j+1,friends,enemy)+" ");

        }


    }


}
