import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int yusha = s.nextInt();
        int monsters[] = new int[yusha + 1];
        int strength[] = new int[yusha];

        // モンスターを倒した数
        int count = 0;

        for (int i = 0; i < yusha+1; i++) {
            monsters[i] = s.nextInt();
        }

        for (int i = 0; i < yusha; i++) {
            strength[i] = s.nextInt();
        }

        for (int i = 0; i < yusha; i++) {
            for (int j = 0; j < 2; j++) {
                if (monsters[j] >= strength[i]) {
                    count += strength[i];
                    if (j == 0) {
                        break;
                    };
                } else {
                    count += monsters[j + i];
                    monsters[i+j] -= (strength[i] - monsters[i+j]);
                }
            }
        }

        System.out.println(count);
    }
}