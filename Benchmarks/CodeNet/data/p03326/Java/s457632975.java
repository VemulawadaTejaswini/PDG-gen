import java.util.*;
public class Main {
    static class N{
        long a,b,c;
        N(long x,long y,long z){
            a=x;b=y;c=z;
        }
        public String toString(){ 
            return (a+" "+b+" "+c);}
        public boolean equals(Object o){
            N n = (N)o;
            return this.a==n.a && this.b==n.b && this.c==n.c;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();int m =sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<N> al1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            al1.add(new N(x,y,z));
        }
        long ans =0l;
        for(int i=-1;i<=1;i+=2){
            for(int j=-1;j<=1;j+=2){
                for(int k=-1;k<=1;k+=2){
                    List<N> al = new ArrayList<>();
                    for(int f = 0;f<n;f++){
                        al.add(new N(1l*i*al1.get(f).a,1l*j*al1.get(f).b,1l*k*al1.get(f).c));
                    }
                    
                    
                    Collections.sort(al, new Comparator<N>(){
                        public int compare(N n1,N n2){
                            if(n1.a!=n2.a){
                           return n1.a>n2.a?-1:1;
                            }
                    if(n1.b!=n2.b){
                        return n1.b>n2.b?-1:1;
                    }
                    if(n1.c!=n2.c){
                        return n1.c>n2.c?-1:1;
                    }
                    return 0;
            }
        });
        long ss=0l;
        for(int ii=0;ii<m;ii++){
            ss+=al.get(ii).a+ al.get(ii).b+al.get(ii).c;
        }
        ans = Math.max(ans, ss);
        
                }
            }
            
        
        
        }
        System.out.println(ans);
    }
}
