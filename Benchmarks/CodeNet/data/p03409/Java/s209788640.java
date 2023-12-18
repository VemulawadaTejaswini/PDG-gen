import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] red = new int[N][2];
        int[][] blue = new int[N][2];
        HashSet<Integer> taken = new HashSet<>();
        for(int i=0;i<N;i++){
            red[i][0] = sc.nextInt(); // x-coordinate
            red[i][1] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            blue[i][0] = sc.nextInt(); // x-coordinate
            blue[i][1] = sc.nextInt();
        }
        myComparator mc = new myComparator();
        Arrays.sort(red,mc);
        Arrays.sort(blue,mc);
        for(int j=0;j<N;j++){
            int i=0;
            int bx = blue[j][0];
            int by = blue[j][1];
            int yMax = Integer.MIN_VALUE;
            int pos = -1;
            while(i<N&&red[i][0]<bx){
                if(taken.contains(i)||red[i][1]>=by) {
                    i++;
                    continue;
                }
                if(red[i][1]>yMax){
                    yMax = red[i][1];
                    pos = i;
                }
                i++;
            }
            if(pos != -1){ // means that there is a red point satisfying the condition
                taken.add(pos);
            }
        }
        System.out.println(taken.size());
    }
    static class myComparator implements Comparator<int[]>{
        public int compare(int[]a, int[]b){
            return a[0]-b[0];
        }
    }
}
