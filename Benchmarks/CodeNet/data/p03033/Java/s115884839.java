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

        ArrayList<Trio> constructs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();int t = sc.nextInt();int x = sc.nextInt();
            constructs.add(new Trio(x ,s-x, t-x)  );
        }

        Collections.sort(constructs, new Comparator<Trio>() { // sort construcions by start date
            @Override
            public int compare(Trio o1, Trio o2) {
                return o1.s - o2.s;
            }
        });


        TreeSet<Trio> sortedByEndTime= new TreeSet<>(new Comparator<Trio>() {
            @Override
            public int compare(Trio o1, Trio o2) {
                return o1.t - o2.t;
            }
        });
        TreeSet<Trio> sortedByDistance= new TreeSet<>( (o1,o2) -> o1.x-o2.x );


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {

            int d= sc.nextInt();

            int idx = 0;
            while(idx < constructs.size() && constructs.get(idx).s <= d ){ //  Starttme <= d
                sortedByEndTime.add(constructs.get(idx));
                sortedByDistance.add(constructs.get(idx));
                idx++;
            }

            while( !sortedByEndTime.isEmpty() &&  sortedByEndTime.first().t <= d ) { //  Endttme >= d remove
                Trio  construct = sortedByEndTime.pollFirst();
                sortedByDistance.remove(construct);
            }

            if(sortedByDistance.isEmpty()){
                //sb.append("-1\n");
                System.out.println("-1");
            }else{
                Trio closestConstru = sortedByDistance.first();
//                sb.append(closestConstru.x);
                System.out.println(closestConstru.x);
            }
            sortedByDistance.clear();
            sortedByEndTime.clear();
        }
    }