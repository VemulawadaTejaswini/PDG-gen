import java.util.*;

public class Main {
    static class Pair implements Comparable<Pair>{
        int d =0;
        int idx =0;
        Pair(int x , int y){
            this.d = x;
            this.idx = y;
        }
        @Override
        public int compareTo(Pair o) {
            return  this.d-o.d;
        }

    }

    static class Trio implements Comparable<Trio>{
        int x=0;
        int s=0;
        int t=0;
        Trio(int x , int s , int t){
            this.x = x;
            this.s = s;
            this.t = t;
        }
        @Override
        public int compareTo(Trio o) {
            int xd = this.x - o.x;
            int sd = this.s - o.s;
            int td = this.t - o.t;
            return xd != 0 ? xd :
                    sd !=0 ? sd :
                            td;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// ins
        int Q = sc.nextInt();//Q people

        int[][] constructs = new int[N][4];
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();int t = sc.nextInt();int x = sc.nextInt();
            constructs[i]=new int[]{x ,s-x, t-x};
        }

        Arrays.sort(constructs, new Comparator<int[]>() { // sort construcions by start date
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });


        TreeSet<int[]> sortedByEndTime= new TreeSet<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        TreeSet<int[]> sortedByDistance= new TreeSet<>( (o1,o2) -> o1[0]-o2[0] );


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {

            int d= sc.nextInt();

            int idx = 0;
            while(idx < constructs.length && constructs[idx][1] <= d ){ //  Starttme <= d
                sortedByEndTime.add(constructs[idx]);
                sortedByDistance.add(constructs[idx]);
                idx++;
            }

            while( !sortedByEndTime.isEmpty() &&  sortedByEndTime.first()[2] <= d ) { //  Endttme >= d remove
                int[]  construct = sortedByEndTime.pollFirst();
                sortedByDistance.remove(construct);
            }

            if(sortedByDistance.isEmpty()){
                //sb.append("-1\n");
                System.out.println("-1");
            }else{
                int[] closestConstru = sortedByDistance.first();
//                sb.append(closestConstru.x);
                System.out.println(closestConstru[0]);
            }
//            sortedByDistance.clear();
//            sortedByEndTime.clear();
        }
    }}