import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N = sc.nextInt();
        List <R> r = new ArrayList<>();
        for(int i=0;i<N;i++){
            r.add(new R(sc.next(),sc.nextInt(),i+1));
        }
        Collections.sort(r);
        for(R t:r){
            System.out.println(t.i);
        }
    }
}
class R implements Comparable<R>{
    String city;
    int point;
    int i;
    public R(String city, int point, int i){
        this.city = city;
        this.point = point;
        this.i = i;
    }
    public int compareTo(R o){
        int t = city.compareTo(o.city);
        if(t!=0){
            return t;
        }
        return Integer.compare(o.point, point);
    }
}