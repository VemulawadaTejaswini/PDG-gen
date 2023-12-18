import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());


        int[] treeArray = new int[N];
        for(int i =0; i < N; i++){
            treeArray[i] = Integer.parseInt(scan.next());
        }
        Arrays.sort(treeArray);


        int sameCount = 0;
        for(int i =0; i < N-1; i++){

            if((treeArray[i+1] - treeArray[i]) == 0) {
                sameCount++;

                if ((sameCount + 1) == K) {
                    System.out.println(0);
                    return;
                }
            }
        }


        System.out.println( treeArray[K-1] - treeArray[0]);
    }
}