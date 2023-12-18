import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[3*N];
        for(int i=0;i<3*N;i++) a[i]=sc.nextLong();
        PriorityQueue<Long> pq1 = new PriorityQueue<>(); //pq1中始终保持N-1个元素
        long sum1=0;
        for(int i=0;i<=N-2;i++) {
            pq1.add(a[i]);
            sum1+=a[i];
        }
        long[] sumL = new long[3*N];
        sumL[N-1]=sum1+a[N-1];
        for(int i=N;i<=2*N-1;i++){// sumL[i]表示取a[i]为最后一个元素时的first-half的和
            if(a[i-1]>pq1.peek()){
                long temp = pq1.poll();
                pq1.add(a[i-1]);
                sumL[i]=sumL[i-1]+a[i]-temp;
            }
            else{
                sumL[i]=sumL[i-1]+a[i]-a[i-1];
            }
        }
        myC mC = new myC();
        PriorityQueue<Long> pq2 = new PriorityQueue<>(16,mC);
        long sum2 = 0;
        long[] sumR = new long[3*N];
        for(int i=3*N-1;i>=2*N;i--){//pq2中始终保持N个元素
            sum2 += a[i];
            pq2.add(a[i]);
        }
        sumR[2*N]=sum2;
        for(int i=2*N-1;i>=N;i++){
            if(a[i]<pq2.peek()){
                long temp = pq2.poll();
                pq2.add(a[i]);
                sumR[i]=sumR[i+1]+a[i]-temp;
            }
            else sumR[i]=sumR[i+1];
        }
        long ans = Long.MIN_VALUE;
        for(int i=N-1;i<=2*N-1;i--){
            ans = Math.max(ans,sumL[i]-sumR[i+1]);
        }
        System.out.println(ans);

    }
    static class myC implements Comparator<Long>{
        public int compare(Long a, Long b){
            long o1=a;
            long o2=b;
            if(o1==o2) return 0;
            else if(o1>o2) return -1;
            else return 1;
        }
    }
}
