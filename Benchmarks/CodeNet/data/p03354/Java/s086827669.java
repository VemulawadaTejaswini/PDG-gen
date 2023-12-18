import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N+1];
        int[][] xy = new int[M+1][2];

        for(int i=1;i<=N;i++){
            p[i] = sc.nextInt();
        }
        for(int i=1;i<=M;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            xy[i][0] = Math.min(left,right);
            xy[i][1] = Math.max(left,right);
        }
        int[] record = new int[N+1];
        for(int i=1;i<=N;i++){
            record[i] = i;
        }
        myComparator mC = new myComparator();
        Arrays.sort(xy,mC);
        for(int i=1;i<=M;i++){
            int left = xy[i][0];
            int right = xy[i][1];
            record[right] = record[left];
        }
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i=1;i<=M;i++){
            if(!map.containsKey(record[i])) {
                HashSet<Integer> cur = new HashSet<>();
                cur.add(record[i]);
                map.put(i,cur);
            }
            else{
                map.get(record[i]).add(i);
            }
        }
        int ans =0;
        for(int j=1;j<=N;j++){
            if(map.get(record[j]).contains(p[j])) ans++;
        }
        System.out.println(ans);


        //System.out.println(ans.get(ans.size()-1));
    }

}
class myComparator implements Comparator<int[]>{
    public int compare(int[] t1, int[] t2){
        return 2*123456*(t1[0]-t2[0])+t1[1]-t2[1];
    }
}