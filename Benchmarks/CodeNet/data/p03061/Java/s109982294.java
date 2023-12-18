import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> A = new HashSet();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }

        while(A.size()>1){
            Iterator<Integer> itr = A.iterator();
            Set<Integer> A_tmp = new HashSet();
            while(itr.hasNext()){
                Integer e1 = itr.next();
                Integer e2 = e1;
                if(itr.hasNext())e2 = itr.next();
                A_tmp.add(koyaku(e1,e2));
            }
            A = A_tmp;
        }
        System.out.println(A.iterator().next());
    }

    public static int koyaku(Integer a, Integer b) {
        int tmp = 0;
        if(a<b){
            tmp=a;
            a=b;
            b=tmp;
        }
        while(b>1){
            tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
}