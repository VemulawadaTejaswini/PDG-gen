import java.util.*;

public class Main {
    public static class time implements Comparable<time>{
        int a;
        int b;
        
        void time(int x,int y){
            this.a=x;
            this.b=y;
        }
        
        public int compareTo(time t){
            if(this.a==t.a){
                return this.b-t.b;
            }else{
                return this.a-t.a;
            }
        }
        
        public void tostring(){
            System.out.print("[ "+this.a+" , "+this.b+" ]");
        }
        
    }
    
    public static int TIME(int a,int b,int t){
        return (t-b)/(a+1);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int T=sc.nextInt();
        time[] ROOT=new time[N];
        
        for(int i=0;i<N;i++){
            time tm=new time();
            tm.a=sc.nextInt();
            tm.b=sc.nextInt();
            ROOT[i]=tm;
        }
        
        Arrays.sort(ROOT);
        int idx=0;
        int ans=0;
        
        
        while(T>0&&idx<N){
            T=TIME(ROOT[idx].a,ROOT[idx].b,T);
            ans++;
            idx++;
            if(idx==N-1){
                ans++;
            }
        }
        ans--;
        
        for(int i=0;i<N;i++){
            ROOT[i].tostring();
        }
        
        System.out.println(ans);
    }
}
