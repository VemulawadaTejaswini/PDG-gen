import java.util.Scanner;
import java.util.Arrays;
 
 
class Main {
    static int n,m;
 
    static int[][] graph;
 
    static int[] fin;
 
    static void dfs(int id,int group){
        fin[id] = group;
        for(int i = 0;i < graph[id].length;i++){
            if(fin[graph[id][i]] == 0){
                dfs(graph[id][i],group);
            }
        }
    }
 
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();m = input.nextInt();
 
        graph = new int[n][];
        fin = new int[n];

        int[] a = new int[n],b = new int[n],k = new int[n];
        for(int i = 0;i < n;i++){
            fin[i] = 0;
            k[i] = 0;
        }

        for(int i = 0;i < m;i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            k[a[i]]++;k[b[i]]++;
        }
        for(int i = 0;i < n;i++)
            graph[i] = new int[k[i]];

        for(int i = 0;i < m;i++){
            k[a[i]]--;k[b[i]]--;
            graph[a[i]][k[a[i]]] = b[i];
            graph[b[i]][k[b[i]]] = a[i];
        }
 
        for(int i = 0;i < n;i++){
            Arrays.sort(graph[i]);
        }

        int group = 1; 
        while(true){
            int iii;
            for( iii = 0;iii < n;iii++){
                if(fin[iii] == 0){
                    dfs(iii,group);
                    break;
                }
            }
            if(iii == n)
                break;

            group++;
        }


        int q = input.nextInt();

        for(int i = 0;i < q;i++){
            if(fin[input.nextInt()] == fin[input.nextInt()])
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}