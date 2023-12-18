import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];

        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
        }

        boolean result = check(p);

        if(!result){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i == j) break;
                    int[] list = p.clone();

                    int tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                    if(check(list)){
                        result = true;
                        break;
                    }
                }
            }
        }

        System.out.println(result ? "YES" : "NO");

    }

    public static boolean check(int[] list){
        boolean result = true;

        for(int i=0; i<list.length-1; i++){
            if(list[i] > list[i+1]){
                result = false;
            }
        }

        return result;
    }
}