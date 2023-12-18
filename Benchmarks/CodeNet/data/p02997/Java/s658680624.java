import java.util.*;
import java.io.*;

class Edge{
    int a,b;
    public Edge(int a, int b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return a+" "+b;
    }

}
public class Main {
    static void impossible(){
        System.out.println("-1");
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(K > N*(N-1)/2 - N + 1) impossible();

        List<Edge> edges = new LinkedList<>();
        for(int n=1; n<N; n++){
            edges.add(new Edge(n,N));
        }
        int pairs = N*(N-1)/2 - N + 1;
        for(int i=1; i<N; i++) for(int j=1+1; j<N; j++){
            if(pairs>K){
                pairs--;
                edges.add(new Edge(i,j));
            }
        }

        System.out.println(edges.size());
        for(Edge e:edges) System.out.println(e);

    }
}