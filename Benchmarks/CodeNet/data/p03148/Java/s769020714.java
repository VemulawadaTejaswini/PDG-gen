import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Sushi[] sushi = new Sushi[N];
        int[] kind = new int[N+1];
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Long> queue = new PriorityQueue<>(10,Collections.reverseOrder());

        for(int i = 0; i<N; i++) {
            sushi[i] = new Sushi(sc.nextInt(),sc.nextInt());
        }
        //for(Sushi s : sushi) System.out.println(s.d);

        Arrays.sort(sushi, (ca, cb)->(cb.d - ca.d));
        long max = 0;
        for(int i = 0; i<K; i++) {
            max += sushi[i].d;
            if(set.contains(sushi[i].t)) list.add(0,i);
            set.add(sushi[i].t);

        }
        max += set.size()*set.size();
        //System.out.println(max);
        //for (int s:list.toArray(new Integer[0])) System.out.println(s);
        queue.add(max);
        long zantei = max;
        for(int i = K; i<N; i++) {
            if(!set.contains(sushi[i].t) || list.size()>0) {
                zantei += sushi[i].d;
                zantei -= sushi[list.get(0)].d;
                zantei -= (set.size())*(set.size());
                zantei += (set.size()+1)*(set.size()+1);
                list.remove(0);
                set.add(sushi[i].t);
                queue.add(zantei);
            }
            //System.out.println(zantei +" "+max +" " + set.size());
        }
        System.out.println(queue.peek());
    }
}
class Sushi {
    int t,d;
    public Sushi(int t, int d) {
        this.t = t;
        this.d = d;
    }
}