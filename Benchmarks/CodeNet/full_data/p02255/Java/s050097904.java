import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int[] A = new int[N];
                for(int i=0; i<N; i++){
                        A[i] = scanner.nextInt();
                }

                for(int i=1; i<N; i++){
                        int key = A[i];
                        int j = i-1;
                        System.out.println(Arrays.toString(A));
                        while(j>=0 && A[j]>key){
                                A[j+1] = A[j];
                                j--;
                        }
                        A[j+1] = key;
                }
                System.out.println(Arrays.toString(A));
        }
}