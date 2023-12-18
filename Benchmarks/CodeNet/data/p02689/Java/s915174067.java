import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] hei = new int[n];
        for(int i=0; i<n; i++){
            hei[i] = sc.nextInt();
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<m; i++){
            edge ed = new edge(sc.nextInt()-1, sc.nextInt()-1);
            if(hei[ed.a]>hei[ed.b]){
                hs.add(ed.b);
            } else if(hei[ed.b]>hei[ed.a]){
                hs.add(ed.a);
            } else{
                hs.add(ed.a); hs.add(ed.b);
            }
        }

        System.out.println(n-hs.size());

        sc.close();
        
    }
    static class edge{
        int a;
        int b;
        edge(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    
}