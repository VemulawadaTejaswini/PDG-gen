import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[] py = new ArrayList[n+1];
        for (int i=0;i<py.length;i++){
            py[i] = new ArrayList<>();
        }
        int[] p = new int[m];
        int[] y = new int[m];
        for (int i=0;i<m;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            py[j].add(k);
            Collections.sort(py[j]);
            p[i] = j;
            y[i] = k;
        }
        for (int i=0;i<m;i++){
           String s1 = Integer.toString(p[i]);
           String s2 = Integer.toString(py[p[i]].indexOf(y[i])+1);
           while (s1.length()<6){
               s1 = "0" + s1;
           }
           while (s2.length()<6){
                s2 = "0" + s2;
           }
           System.out.println(s1+s2);
        }
    }
}