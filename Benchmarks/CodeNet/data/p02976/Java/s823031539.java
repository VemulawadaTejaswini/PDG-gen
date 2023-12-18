import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int M=sc.nextInt();

        ArrayList<Integer>[] A=new ArrayList[N];
        int[] B=new int[N];
        for(int i=0;i<N;i++){
            A[i]=new ArrayList<>();
            B[i]=0;
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            A[a].add(b);
            A[b].add(a);
        }
        if(M%2==1){
            System.out.println(-1);
            return;
        }
        StringBuilder br=new StringBuilder();
        while(true) {
            boolean breakFrag2=true;
            while (true) {
                boolean breakFrag = true;
                for (int i = 0; i < N; i++) {
                    if (A[i].size() == 1) {
                        A[A[i].get(0)].remove(Integer.valueOf(i));
                        if (B[i] % 2 == 0) {
                            B[A[i].get(0)]++;
                            br.append(A[i].get(0)+1);
                            br.append(" ");
                            br.append(i+1);
                            br.append("\n");
                        } else {
                            br.append(i+1);
                            br.append(" ");
                            br.append(A[i].get(0)+1);
                            br.append("\n");
                        }
                        A[i].remove(0);
                        breakFrag = false;
                    }
                }
                if (breakFrag) break;
            }
            for(int i=0;i<M;i++){
                if(A[i].size()!=0){
                    if(B[i]%2==0){
                        br.append(i+1);
                        br.append(" ");
                        br.append(A[i].get(0)+1);
                        br.append("\n");
                        A[A[i].get(0)].remove(Integer.valueOf(i));
                        A[i].remove(0);
                        br.append(i+1);
                        br.append(" ");
                        br.append(A[i].get(0)+1);
                        br.append("\n");
                        A[A[i].get(0)].remove(Integer.valueOf(i));
                        A[i].remove(0);

                    }else{
                        br.append(i+1);
                        br.append(" ");
                        br.append(A[i].get(0)+1);
                        br.append("\n");
                        A[A[i].get(0)].remove(Integer.valueOf(i));
                        A[i].remove(0);

                        B[A[i].get(0)]++;
                        br.append(A[i].get(0)+1);
                        br.append(" ");
                        br.append(i+1);
                        br.append("\n");
                        A[A[i].get(0)].remove(Integer.valueOf(i));
                        A[i].remove(0);


                    }
                    breakFrag2=false;
                    break;
                }

            }
            if(breakFrag2)break;
        }
        System.out.println(br.toString());


    }
}
