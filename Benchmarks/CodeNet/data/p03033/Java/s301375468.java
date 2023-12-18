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

        TreeSet<Trio> consts = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();int t = sc.nextInt();int x = sc.nextInt();
            consts.add(new Trio(x ,s-x, t-x)  );
        }
        TreeSet<Pair> people = new TreeSet<>();
        for (int i = 0; i < Q; i++) {
            people.add(new Pair(sc.nextInt(),i));//sorted
        }

        int[] ans = new int[Q];
        Arrays.fill(ans,-1);
        //check the person with contruction and if hits delete and memo index
        while(!consts.isEmpty()) {
            Trio constr = consts.pollFirst();
            SortedSet<Pair> lower_bound = people.tailSet(new Pair(constr.s,-1));
            Iterator<Pair> it = lower_bound.iterator();
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
}