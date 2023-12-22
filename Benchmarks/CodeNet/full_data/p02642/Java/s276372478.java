import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> p = new HashSet<>();

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        boolean[] devided = new boolean[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        List<Integer> list = new LinkedList();
        for(int i=0;i<N;i++){
            list.add(A[i]);
        }

        int i=0;
        while(i < list.size()){
                int j = i +1;
                boolean isSame = false;

                int x = list.get(i);
                if(i + 1 < list.size() && x == list.get(j)){
                    isSame = true;
                }
                while(j < list.size()) {
                    if(list.get(j) % x == 0){
                        list.remove(j);
                    } else{
                        j++;
                    }
                }
                if(!isSame){
                    i++;
                } else {
                    list.remove(i);
                }
        }

        System.out.println(list.size());

    }

}
