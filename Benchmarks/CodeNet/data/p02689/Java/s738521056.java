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
        edge[] ed = new edge[m];
        for(int i=0; i<m; i++){
            ed[i] = new edge(sc.nextInt()-1, sc.nextInt()-1);
        }

        int count = 0;
        for(int i=0; i<n; i++){
            boolean goo = true;
            for(int j=0; j<m; j++){
                if(ed[j].a==i&&hei[i]<=hei[ed[j].b]){
                    goo = false;
                    break;
                } else if(ed[j].b==i&&hei[i]<=hei[ed[j].a]){
                    goo = false;
                    break;
                } 
            }
            if(goo) count++;
        }

        System.out.println(count);

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