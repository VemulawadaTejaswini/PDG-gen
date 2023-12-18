import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),ans = 0;
        int[] list = new int[a];
        for(int i = 0; i < b; i++){
            int c = sc.nextInt();
            for (int j = 0; j < c; j++){
                list[sc.nextInt()-1] +=1;
            }
        }
        for(int x: list){
            if(x == 0) ans++;
        }
        System.out.println(ans);
    }
}






