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
        int[] railways = new int[n+1];
        List<HashSet<Integer>> group = new ArrayList<>(n+1);
        List<HashSet<Integer>> group2 = new ArrayList<>(n+1);
        HashMap<String,Integer> mem = new HashMap<>();
        for(int i =0;i<=n;i++){
            group.add(new HashSet<>());
            group2.add(new HashSet<>());
        }
        for(int i=0;i<k;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if (a<b)
                roads[b]=a;
            else
                roads[a]=b;
        }
        for(int i=0;i<l;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if (a<b)
                railways[b]=a;
            else
                railways[a]=b;
        }
        group.get(1).add(1);
        for(int i=1;i<=n;i++){
            if (roads[i]==0)
                group.get(i).add(i);
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
            if (railways[i]==0)
                group2.get(i).add(i);
            else{
                int boss = railways[i];
                if (railways[boss] ==0)
                    group2.get(boss).add(i);
                else{
                    group2.get(railways[boss]).add(i);
                    railways[i] = railways[boss];
                }
            }


        }
        for(int i=1;i<=n;i++){
            int j,jj;
            if (roads[i]==0)
                j = i;
            else
                j= roads[i];
            if (railways[i]==0)
                jj = i;
            else
                jj= railways[i];
            String t = Integer.toString(j)+"-"+Integer.toString(jj);
            if (!mem.containsKey(t)){
                HashSet<Integer> intersect = new HashSet<>(group.get(j));
                intersect.retainAll(group2.get(jj));
                mem.put(t,intersect.size());
            }

            System.out.print(mem.get(t)+" ");
        }
    }

}
