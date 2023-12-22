import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Data> D = new ArrayList<Data>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            long v = sc.nextLong();
            long w = sc.nextLong();
            char t = sc.next().charAt(0);
            long d = sc.nextLong();
            String s = sc.next();
            D.add(new Data(v,w,t,d,s));
        }
        Collections.sort(D);
        Iterator<Data> it = D.iterator();
        while(it.hasNext()){
            Data a = it.next();
            a.print();
        }
    }
}
class Data implements Comparable<Data>{
    long v;
    long w;
    char t;
    long d;
    String s;
    Data(long v, long w, char t, long d, String s){
        this.v = v;
        this.w = w;
        this.t = t;
        this.d = d;
        this.s = s;
    }
    public void print(){
        System.out.println(v + " " + w + " " + t + " " + d + " " + s);
    }
    public int compareTo(Data x){
        if(v < x.v)
            return -1;
        else if(v == x.v){
            if(w < x.w)
                return -1;
            else if(w == x.w){
                if(t < x.t)
                    return -1;
                else if(t == x.t){
                    if(d < x.d)
                        return -1;
                    else if(d == x.d){
                        return s.compareTo(x.s);
                    }
                    else
                        return 1;
                }
                else
                    return 1;
            }
            else
                return 1;
        }
        else
            return 1;
    }
}
