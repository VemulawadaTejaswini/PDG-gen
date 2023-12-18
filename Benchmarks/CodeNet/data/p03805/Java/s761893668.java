import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static ArrayList<Integer>[] vertice;
    static int ans = 0;
    static int total = 0;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        total = n;
        vertice = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            vertice[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            vertice[a].add(b);
            vertice[b].add(a);
        }
        ArrayList<Integer> run = new ArrayList<>();
        bfs(run,1);
        System.out.println(ans);
    }
    static void bfs(ArrayList<Integer> arr,int node){
        arr.add(node);
        for(int v : vertice[node]){
            if(!arr.contains(v)){
                ArrayList<Integer> temp = new ArrayList<>(arr);
                bfs(temp,v);
            }
        }

        if(arr.size()==total){
            ans++;
        }

    }
}
