import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        Double[]A=new Double[N];
        ArrayList<List<Double>> B=new ArrayList<>();
        for(int i=0;i<N;i++){
            A[i]=(double)sc.nextInt();
        }
        Arrays.sort(A, Collections.reverseOrder());
        B.add(Arrays.asList(A));

        ArrayList<Integer> pos=new ArrayList<>();
        pos.add(0);
        for(int l=0;l<K;l++){
            double max=0;
            int maxpos=0;
            for(int i=0;i<B.size();i++){

                if(pos.get(i)<B.get(i).size()){
                    if(B.get(i).get(pos.get(i))>max){
                        max=B.get(i).get(pos.get(i));
                        maxpos=i;
                    }
                }
            }
            if(maxpos==B.size()-1){
                B.add(new ArrayList<>());
                pos.add(0);
            }

            B.get(maxpos+1).add(B.get(maxpos).get(pos.get(maxpos))*(maxpos+1)/(maxpos+2));
            pos.set(maxpos,pos.get(maxpos)+1);

        }
        double max2=0;
        int maxpos2=0;
        for(int i=0;i<B.size();i++){
            if(pos.get(i)<B.get(i).size()) {
                if (B.get(i).get(pos.get(i)) > max2) {
                    max2 = B.get(i).get(pos.get(i));
                    maxpos2 = i;
                }
            }
        }


        System.out.println((int)Math.ceil(max2));
    }
}