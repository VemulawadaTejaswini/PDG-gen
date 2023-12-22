import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        int hit, blow;

        while (sc.hasNextInt()) {
            for(int i = 0;i < 4;i++){
            	x[i] = sc.nextInt();
            }
            for(int i = 0;i < 4;i++){
            	y[i] = sc.nextInt();
            }

            hit = blow = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (x[i] == y[j]) {
                    	if(i == j){
                    		hit++;
                    	}else {
                    		blow++;
                    	}
                    }
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}