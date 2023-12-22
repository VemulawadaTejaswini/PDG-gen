import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] C = new String[N];
        for(int i = 0; i < N; i++){
            C[i] = sc.next();
        }
        String[] B = C.clone();
        String[] S = C.clone();
        BubbleSort(B, N);
        for(int i = 0; i < N; i++){
            System.out.print(B[i]);
            if(i != N - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Stable");
        SelectionSort(S, N);
        for(int i = 0; i < N; i++){
            System.out.print(S[i]);
            if(i != N - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        if(isSame(B, S)){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }
    }

    public static void BubbleSort(String[] C, int N){
        for(int i = 0; i < N; i++){
            for(int j = N - 1; j > i; j--){
                int val1 = Character.getNumericValue(C[j].charAt(1));
                int val2 = Character.getNumericValue(C[j - 1].charAt(1));
                if(val1 < val2){
                    String temp = C[j];
                    C[j] = C[j - 1];
                    C[j - 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(String[] C, int N){
        for(int i = 0; i < N; i++){
            int minj = i;
            for(int j = i; j < N; j++){
                if(Character.getNumericValue(C[j].charAt(1)) < Character.getNumericValue(C[minj].charAt(1))){
                    minj = j;
                }
            }
            String temp = C[i];
            C[i] = C[minj];
            C[minj] = temp;
        }
    }

    public static boolean isSame(String[] a, String[] b){
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
}
