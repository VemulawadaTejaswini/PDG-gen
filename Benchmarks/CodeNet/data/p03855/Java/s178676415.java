import sun.font.TrueTypeFont;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int[] roads = new int[n+1];
        int[] rialways = new int[n+1];
        List<HashSet<Integer>> group = new ArrayList<>(n+1);
        List<HashSet<Integer>> group2 = new ArrayList<>(n+1);
        HashMap<String,Integer> mem = new HashMap<>();
        for(int i=1;i<=n;i++){
            roads[i]=i;
            rialways[i]=i;
        }
        for(int i =0;i<=n;i++){
            group.add(new HashSet<>());
            group2.add(new HashSet<>());
        }
        for(int i=0;i<k;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int boss = Math.min(roads[a],roads[b]);
            int boss1 = roads[roads[a]];
            int boss2 = roads[roads[b]];
            roads[boss1]=boss;
            roads[boss2]=boss;
        }
        for(int i=0;i<l;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int boss = Math.min(rialways[a],rialways[b]);
            int boss1 = rialways[rialways[a]];
            int boss2 = rialways[rialways[b]];
            rialways[boss1]=boss;
            rialways[boss2]=boss;
        }

        for(int i=1;i<=n;i++){
            if (roads[i]==0){
                group.get(i).add(i);
            }

            else{
                int boss = roads[i];
                if (roads[boss] ==0)
                    group.get(boss).add(i);
                else{
                    group.get(roads[boss]).add(i);
                    roads[i] = roads[boss];
                }
            }


        }
        for(int i=1;i<=n;i++){
            if (rialways[i]==0){
                group2.get(i).add(i);
            }

            else{
                int boss = rialways[i];
                if (rialways[boss] ==0)
                    group2.get(boss).add(i);
                else{
                    group2.get(rialways[boss]).add(i);
                    rialways[i] = rialways[boss];
                }
            }


        }
        for(int i=1;i<=n;i++){
            int j = roads[i];
            int jj = rialways[i];
            HashSet<Integer> intersect = new HashSet<>(group.get(j));
            intersect.retainAll(group2.get(jj));
            System.out.print(intersect.size()+" ");
        }

    }

}
