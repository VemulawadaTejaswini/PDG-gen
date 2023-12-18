import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        List<Integer> maxList = new ArrayList<>();

        A:for(int i=0; i<N; i++){
            //System.err.println(A[i]);
            maxList.sort(Comparator.reverseOrder());
            for(int j=0; j<maxList.size(); j++){
                //System.err.println(j + "(" + maxList.get(j) + ")" +  " : " + A[i]);
                if(A[i] > maxList.get(j)){
                    //System.err.println(j + "(" + maxList.get(j) + ")" +  " -> " + A[i]);
                    maxList.set(j, A[i]);
                    continue A;
                }
            }
            //System.err.println("add " + A[i]);
            maxList.add(A[i]);
        }

        int result = maxList.size();
        System.out.println(result);

    }
}
