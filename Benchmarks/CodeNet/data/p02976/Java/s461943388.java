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
        StringBuilder br=new StringBuilder();
        while (true) {
            boolean breakFrag = true;
            for (int i = 0; i < N; i++) {
                if (A[i].size() == 1) {
                    A[A[i].get(0)].remove(Integer.valueOf(i));
                    if (A[A[i].get(0)].size() == 1) {
                        if((B[A[i].get(0)]+B[i])%2==0){
                            System.out.println(-1);
                            return;
                        }
                    }

                    if (B[i] % 2 == 0) {
                        B[A[i].get(0)]++;
                        br.append(A[i].get(0)+1);
                        br.append(" ");
                        br.append(i+1);
                        br.append("\n");
                    } else {
                        B[i]++;
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
        for(int j=0;j<N;j++){
            ArrayList<Integer> task=new ArrayList<Integer>();
            if(A[j].size()!=0) {
                task.add(j);
                while(A[j].size()>1) {
                    if (A[A[j].get(0)].size() == 1&&B[A[j].get(0)]%2!=0) {
                        B[A[j].get(0)]++;
                        br.append(A[j].get(0) + 1);
                        br.append(" ");
                        br.append(j + 1);
                        br.append("\n");
                    }else{
                        B[j]++;
                        br.append(j + 1);
                        br.append(" ");
                        br.append(A[j].get(0) + 1);
                        br.append("\n");
                        
                    }

                    A[A[j].get(0)].remove(Integer.valueOf(j));
                    if (A[A[j].get(0)].size() == 1) {
                        task.remove(0);
                        task.add(A[j].get(0));
                        A[j].remove(0);
                        j=j-1;

                        break;
                    }
                    A[j].remove(0);
                }

                while(task.size()!=0) {
                    int i=task.get(0);
                    task.remove(0);
                    if(A[i].size()==0)continue;
                    if (A[A[i].get(0)].size() == 1) {
                        if((B[A[i].get(0)]+B[i])%2==0){
                            System.out.println(-1);
                            return;
                        }
                    }
                    if (B[i] % 2 == 0) {
                        B[A[i].get(0)]++;
                        br.append(A[i].get(0)+1);
                        br.append(" ");
                        br.append(i+1);
                        br.append("\n");
                    } else {
                        B[i]++;
                        br.append(i+1);
                        br.append(" ");
                        br.append(A[i].get(0)+1);
                        br.append("\n");
                    }
                    A[A[i].get(0)].remove(Integer.valueOf(i));
                    if (A[A[i].get(0)].size() == 1) {
                        task.add(A[i].get(0));
                    }
                    A[i].remove(0);

                }

            }
        }
        System.out.println(br.toString());


    }
}
