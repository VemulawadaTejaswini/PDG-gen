import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        long K=sc.nextLong();
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<ArrayList<Integer>>R=new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        ArrayList<Integer>B=new ArrayList<>();
        do {
            B.addAll(A);
            for(int i=0;i<B.size();i++){
                Integer a=B.get(i);
                if(B.indexOf(a)>=0&&B.indexOf(a)<i){
                    for(int v=B.indexOf(a);v<=i;v++){
                        B.set(v,null);
                    }
                }
            }
            B.removeAll(Collections.singleton(null));
            R.add(new ArrayList<Integer>(B));

        }while(B.size()!=0);
        long loop=R.size();
        ArrayList<Integer> result=R.get((int)((K-1)%loop));
        StringBuilder br=new StringBuilder();
        for(int i :result){
            br.append(i);
            br.append(' ');
        }
        System.out.println(br.toString());



    }
}
