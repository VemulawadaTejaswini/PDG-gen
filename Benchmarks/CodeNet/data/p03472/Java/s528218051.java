import java.util.*;

public class Main {
    static class pair implements Comparator<pair>{
        int a,b;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }

        @Override
        public int compare(pair t1, pair t2) {
            if(t2.b==t1.b){
                return t2.a-t1.a;
            }
            return t2.b-t1.b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int max=Integer.MIN_VALUE;
        pair[] pa=new pair[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            max=Math.max(max,a);
            pa[i]=new pair(a,b);
        }
        Arrays.sort(pa,new pair(0,0));
        int sum=0,ct=0;
        boolean cd=false;
        for(int i=0;i<n;i++){
            if(pa[i].b>=max){
                sum+=pa[i].b;
                ct++;
            }
            else{
                break;
            }
            if(sum>=h){
                cd=true;
                break;
            }
        }
        if(!cd){
            ct+=Math.ceil((h-sum)/(double)max);
        }
        System.out.println(ct);
    }
}
