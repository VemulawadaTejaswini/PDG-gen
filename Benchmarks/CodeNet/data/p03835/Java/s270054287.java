import java.util.*;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int K = sc.nextInt();
        int S = sc.nextInt(); // 最大値

        int x,y,z;
        int index = 0;

        for (x = 0;x <= K;x++) {
            for(y = 0;y <= K;y++) {
                for (z = 0;z <= K;z++) {
                    if(x + y + z == S) {
                        index++;
                    } 
                }
            }
        }
        System.out.print(index);
        sc.close();
    }

}