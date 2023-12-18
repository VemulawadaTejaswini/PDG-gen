import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        int minMod = 2019;

        for(int i =L;i< R;i++){
            for(int j= i+1;j< R +1;j++){
                minMod = Math.min(minMod,(i*j) % 2019);
                if(minMod == 0){
                    System.out.println(0);
                    System.exit(0);
                }
            }
        }

        System.out.println(minMod);


    }



}
