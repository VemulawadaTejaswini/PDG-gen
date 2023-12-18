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
            return  o.d - this.d;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return d == pair.d &&
                    idx == pair.idx;
        }

        @Override
        public int hashCode() {
            return Objects.hash(d, idx);
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Trio trio = (Trio) o;
            return x == trio.x &&
                    s == trio.s &&
                    t == trio.t;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, s, t);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// ins
        int Q = sc.nextInt();//Q people

        List<Trio> consts = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();int t = sc.nextInt();int x = sc.nextInt();
            consts.add(new Trio(x ,s-x, t-x)  );
        }

        Collections.sort(consts);

        List<Pair> people = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            people.add(new Pair(sc.nextInt(),i));//sorted
        }

        int[] ans = new int[Q];
        Arrays.fill(ans,-1);
        //check the person with contruction and if hits delete and memo index
        for (int i = 0; i < consts.size(); i++) {
            Trio constr = consts.get(i);
            int lowerBoundIdx = lower_bound(people,constr.s);
            Iterator<Pair> it = people.listIterator(lowerBoundIdx);
            while(it.hasNext()){
                    Pair person = it.next();
                    if(person.d >= constr.t ) break;
                    ans[person.idx]= constr.x;
                    it.remove();
            }
        }
        for(int dis:ans){
            System.out.println(dis);
        }
    }

    static int lower_bound(List<Pair> list, int key){
        int l = -1;
        int h = list.size();

        while(h-l>1){
            int m = (h+l)/2;
            if( list.get(m).d >=key){
                h = m;
            }else{
                l = m;
            }
        }
        return h;
    }

}