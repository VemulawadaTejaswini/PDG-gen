import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        long D=sc.nextLong();
        D *= D;
        ArrayList<pair> p = new ArrayList<>();
        for(int i=0;i<N;i++){
            long x=sc.nextInt(),y=sc.nextInt();
            pair t = new pair(x,y);
            x *= x;
            y *= y;
            if((!p.contains(t))&&(D>=x+y)){
                p.add(t);
            }
        }
        System.out.println(p.size());
    }
}
class pair {
    long a;
    long b;
    public pair(long a,long b){
        this.a=a;
        this.b=b;
    }
    public pair(){}
}