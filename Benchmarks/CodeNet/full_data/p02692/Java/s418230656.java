import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final int INF = -(int) 1e6;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = sc.nextInt();
            sum += ABC[i];
        }
        //選ばれてないもの(A=0, B=1, C=2)が入る
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            switch (str) {
                case "AB":
                    s[i] = 2;
                    break;
                case "BC":
                    s[i] = 0;
                    break;
                case "AC":
                    s[i] = 1;
                    break;
            }
        }

        if(sum == 0){
            System.out.println("No");
        }else if(sum == 1){
            StringBuilder strb = new StringBuilder("Yes\n");
            boolean possible = true;
            for(int i = 0 ; i < N ; i++){
                int x = next(s[i]);
                int y = unChosen(s[i], x);
                int choice = ABC[x] == 1 ? "ABC".charAt(x) : "ABC".charAt(y);
                if(ABC[s[i]] == 1){
                    possible = false;
                }else{
                    int tmp = ABC[x];
                    ABC[x] = ABC[y];
                    ABC[y] = tmp;
                    strb.append(choice);
                    strb.append("\n");
                }
            }
            if(possible){
                System.out.println(strb.toString());
            }else{
                System.out.println("No");
            }
        }else if(ABC[next(s[0])] == 0 && ABC[unChosen(s[0], next(s[0]))] == 0){
            System.out.println("No");
        }else{
            StringBuilder strb = new StringBuilder("Yes\n");
            for(int i = 0 ; i < N ; i++){
                int x = next(s[i]);
                int y = unChosen(x, s[i]);
                int choice = 0;
                if(sum == 2 && ABC[x] == 1 && ABC[y] == 1){
                    if(s[i+1] == x){
                        ABC[x]--;
                        ABC[y]++;
                        choice = y;
                    }else{
                        ABC[y]--;
                        ABC[x]++;
                        choice = x;
                    }
                }else{
                    if(ABC[x] == 0){
                        ABC[x]++;
                        ABC[y]--;
                        choice = x;
                    }else{
                        ABC[x]--;
                        ABC[y]++;
                        choice = y;
                    }
                }
                strb.append("ABC".charAt(choice));
                strb.append("\n");
            }
            System.out.println(strb.toString());
        }
    }

    private static int unChosen(int x, int y) {
        return 3 - x - y;
    }

    private static int next(int x){
        return (x+1) % 3;
    }

    private static boolean isAllNonNegative(int[] vals) {
        boolean result = true;
        for (int val : vals) {
            if (val < 0) {
                result = false;
            }
        }
        return result;
    }
}
