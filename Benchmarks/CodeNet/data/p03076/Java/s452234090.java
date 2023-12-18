import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int D[] = new int[5];

        D[0] = sc.nextInt();
        D[1] = sc.nextInt();
        D[2] = sc.nextInt();
        D[3] = sc.nextInt();
        D[4] = sc.nextInt();
        int minMod = 10;
        int time = 0;

        for(int i=0;i<5;i++){
            int mod = D[i] % 10;
            if(mod < minMod && mod != 0){
                minMod = mod;
            }

            if(mod != 0){
                time += D[i] - mod + 10;
            } else {
                time += D[i];
            }

        }


        System.out.println(time + minMod - 10);

    }

}
