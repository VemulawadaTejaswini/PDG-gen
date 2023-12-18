
import java.util.*;

class Main {



	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L[] = new int[N];
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i=0; i<N; i++){
            L[i] = sc.nextInt();
        }

        Arrays.sort(L, Comparator.reverseOrder());


        for(int i=0; i < N-2; i++){
            for(int j=i+1; j < N-1; j++){
                for(int k=j+1; k < N; k++){
                    a = L[i];
                    b = L[j];
                    c = L[k];

                    if(a < b+c && b < c+a && c < b+a){
                        count++;
                    }
                }
            }
        }


        System.out.println(count);

    }



}





