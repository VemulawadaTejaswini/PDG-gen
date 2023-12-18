
import java.util.*;

public class Main {
    private static int N,Q;
    private static Section[] works;
    private static TreeSet<People> people;
    private static Integer[] sum;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        Q = in.nextInt();
        int l,r,x;
        works = new Section[N];
        people = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int c = o1.x - o2.x;
                if(c == 0){
                    return o1.dis - o2.dis;
                }
                return c;
            }
        });
        sum = new Integer[Q];
        Section section;
        for(int i=0;i<N;i++){
            l = in.nextInt();
            r = in.nextInt();
            x = in.nextInt();
            l = (l-x)<0? 0:(l-x);
            r = (r-x)>0? (r-x):0;
            if(r > 0){
                works[i]=new Section(l,r,x);
            }
        }
        for(int i=0;i<Q;i++){
            people.add(new People(in.nextInt(),i));
        }
        Arrays.sort(works, new Comparator<Section>() {
            @Override
            public int compare(Section o1, Section o2) {
                return o1.dis - o2.dis;
            }
        });

        People vis1 = new People(0,0);
        People vis2 = new People(0,0);
        People vis3,vis4;
        Section s;
        int le,ri;
        NavigableSet<People> navigableSet;
        Iterator<People> it;
        //System.out.println(works);
        //System.out.println(people);
        for(int i=0;i<N;i++){
            s = works[i];
            le = s.left;
            ri = s.right;
            //System.out.println("le="+le+",ri="+ri);
            vis1.x = le;
            vis2.x = ri;
            vis3 = people.lower(vis1) ;
            vis4 = people.lower(vis2);
            if(people.isEmpty()) break;
            boolean flag = false;
            if(vis3 == null && le <= people.first().x) {vis3 = people.first();flag=true;}
            if(vis4 == null || vis3==null) continue;
            //System.out.println(vis3);
            //System.out.println(vis4);

            navigableSet = people.subSet(vis3, flag, vis4, true);
            it = navigableSet.iterator();
            while(it.hasNext()){
                vis3 = it.next();
                it.remove();
                //System.out.println(vis3.x+"====="+vis3.dis);
                sum[vis3.dis]=s.dis;
            }
            //System.out.println("i===="+i);
        }

        for(int i=0;i<Q;i++) {
                System.out.println(sum[i]==null? -1:sum[i]);
        }
    }
    public static class Section{
        public Integer left;
        public Integer right;
        public Integer dis;
        public Section(Integer left,Integer right,Integer dis){
            this.left = left;
            this.right = right;
            this.dis = dis;
        }
        public String toString(){
            return "["+left+","+right+")"+dis;
        }
    }
    public static class People{
        public Integer x;
        public Integer dis;
        public People(Integer x,Integer dis){
            this.x = x;
            this.dis = dis;
        }

        @Override
        public String toString() {
            return x+","+dis;
        }
    }
}

