import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int max=1000,min=0,total=0,ave=0,n;
                int s = sc.nextInt();
                int[] scores = new int[s];
                n = scores.length;
                for (int i = 0; i < n; i++) {
                    scores[i] = sc.nextInt();
                    if(max<scores[i]) {
                        max = scores[i];
                    }if(min >scores[i]){
                        min = scores[i];
                    }
                    total += scores[i];
                }
                total = total -max -min;
                ave = total/(n-2);
                System.out.printf("%d\n", ave);
            }
        }
    }
}
