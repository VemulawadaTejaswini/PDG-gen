import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String y = sc.next();

        char [] c = y.toCharArray();
        int count =0;
        int kotae = 0;
        int countA =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = i; k < n; k++) {
                    if(c[j] == c[k]){
                        count++;
                    }
                    for (int l = 0; l < j; l++) {
                        if(c[j] == c[l]){
                                count=0;
                        }
                    }
                }
                if(count > 0){
                    countA++;
                }
                count =0;
            }
            kotae = Math.max(kotae,countA);
            countA = 0;
        }

        System.out.println(kotae);
    }
}
