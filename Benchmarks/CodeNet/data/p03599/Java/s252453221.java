import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()*100;
        int b = sc.nextInt()*100;
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        double max = 0;
        int[] ans = new int[2];
        for (int i = 0; i < 31; i++) {
            if(a*i > f) break;
            for (int j = 0; j < 31; j++) {
                double w = a*i + b*j;
                if(w > f) break;
                if(i + j == 0) continue;
                for (int k = 0; k < 1501; k++) {
                    if(w + c*k > f) break;
                    if(c*k > w /100 *e) break;
                    for (int l = 0; l < 1501; l++) {
                        if(k + l == 0) continue;
                        double s = c*k + d*l;
                        if(w + s > f) break;
                        if(s > w /100 *e) break;
                        double tmp = s / (w + s);
                        if(tmp > max){
                            max = tmp;
                            ans[0] = (int) (w + s);
                            ans[1] = (int) s;
                        }
                    }
                }
            }
        }

        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }

}
