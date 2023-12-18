import java.util.*;

class Main{
    static int result = 0;
    static int N = 0;
    static int K = 0;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        int[] V = new int[3*N];
        ArrayList<Integer> check = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            V[N+i] = sc.nextInt();
        }
        sc.close();
        int first = N;
        int last = 2*N;

        int[] C = array_int(check);
        trial(V, C, first, last, 1, 1);
        trial(V, C, first, last, 1, 2);
        trial(V, C, first, last, 1, 3);
        trial(V, C, first, last, 1, 4);
        System.out.println(result);
    }

    public static void trial(int[] V, int[] check, int first, int last, int trial_num, int type) {
        if(trial_num>K){
            return;
        }
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i=0;i<check.length;i++){
            C.add(check[i]);
        }
        C.sort((a,b)->a-b);
        if(type==1){
            if(first==last)return;
            C.add(V[first]);
            first++;
        }
        if(type==2){
            if(first==last)return;
            C.add(V[last-1]);
            last--;
        }
        if(type==3){
            if(C.size()==0)return;
            if(first==0)return;
            first--;
            V[first] = C.get(0);
            C.remove(0);
        }
        if(type==4){
            if(C.size()==0)return;
            if(last==3*N-1)return;
            last++;
            V[last-1] = C.get(0);
            C.remove(0);
        }
        int tmp =0;
        for(Integer i:C){
            tmp+=i;
        }
        if(result<tmp)result=tmp;
        int[] C2 = array_int(C);
        trial(V, C2, first, last, trial_num+1, 1);
        trial(V, C2, first, last, trial_num+1, 2);
        trial(V, C2, first, last, trial_num+1, 3);
        trial(V, C2, first, last, trial_num+1, 4);
        return;
    }

    public static int[] array_int(ArrayList<Integer> a) {
        int[] A = new int[a.size()];
        for(int i=0;i<a.size();i++){
            A[i] = a.get(i);
        }
        return A;
    }

    public static int sum(int[] a ) {
        int result=0;
        for(int i=0;i<a.length;i++){
            result+=a[i];
        }
        return result;
    }
}