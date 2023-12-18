import java.util.*;

class Main {
    static int[] idx;
    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new int[n];
        idx = new int[n+1];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
            idx[A[i]] = i;
        }
        ST even = new ST(n/2);
        ST odd = new ST(n/2);
        ST idxRec = new ST(n);
        ST idxFromLeft = new ST(n);
        for(int i=0;i<n;i+=2) even.update(i/2,A[i]);
        for(int i=1;i<n;i+=2) odd.update(i/2,A[i]);
        for(int i=0;i<n;i++) idxRec.update(i,n);
        for(int i=0;i<n;i++) idxFromLeft.update(i,1);
        ArrayList<Integer> res = new ArrayList<>();

        boolean[] used = new boolean[n+1];

        for(int i=1;i<=n;i++){
            if(idx[i]%2==1) continue;
            int curIdx = idx[i];
            int next = odd.find((curIdx+1)/2,n/2);
            res.add(i);
            res.add(next);
            used[i]=true;
            used[next]=true;
            idxRec.update(curIdx,curIdx);
            idxRec.update(idx[next],idx[next]);
            idxFromLeft.update(curIdx,-curIdx);
            idxFromLeft.update(idx[next],-idx[next]);
            break;
        }
        for(int i=1;i<=n;i++){
            if(used[i]) continue;
            int curIdx = idx[i];
            int farthest = idxRec.find(curIdx,n-1);
            int temp = idxFromLeft.find(0,curIdx-1);
            int leftMost = temp>0?-1:-temp;
            if(farthest-curIdx<=1||(farthest-curIdx)%2==1) continue;
            if((curIdx-leftMost)%2==0) continue;
            int[] bound = computeBound(curIdx,farthest);
            int next = curIdx%2==0?odd.find(bound[0],bound[1]):even.find(bound[0],bound[1]);
            res.add(i);
            res.add(next);
            used[i]=true;
            used[next]=true;
            idxRec.update(curIdx,curIdx);
            idxRec.update(idx[next],idx[next]);
            idxFromLeft.update(curIdx,-curIdx);
            idxFromLeft.update(idx[next],-idx[next]);
        }
        for(int i=0;i<res.size();i++){
            System.out.print(Integer.toString(res.get(i))+" ");
        }
    }
    static int[] computeBound(int cur, int farthest){
        if(cur%2==1){
            int end = farthest%2==1?farthest-1:farthest-2;
            return new int[]{(cur+1)/2,end/2};
        } else{
            int end = farthest%2==0?farthest-1:farthest-2;
            return new int[]{(cur+1)/2,end/2};
        }
    }
    static class ST{
        int n=1;
        int[] dat;

        public ST(int n_){
            while(n<n_) n*=2;
            dat = new int[2*n-1];
            for(int i=0;i<2*n-1;i++) dat[i] = Integer.MAX_VALUE/2;
        }
        public void update(int idx, int val){
            idx += n-1;
            dat[idx] = val;
            while(idx>0){
                idx = (idx-1)/2;
                dat[idx] = Math.min(dat[idx*2+1],dat[idx*2+2]);
            }
        }

        public int find(int a, int b){
            return query(a,b+1,0,0,n);
        }
        private int query(int a, int b, int k, int left, int right){
            if(b<=left||right<=a) return Integer.MAX_VALUE;
            if(a<=left&&right<=b) return dat[k];
            int v1 = query(a,b,2*k+1,left,(left+right)/2);
            int v2 = query(a,b,2*k+2,(left+right)/2,right);
            return Math.min(v1,v2);
        }
    }
}
