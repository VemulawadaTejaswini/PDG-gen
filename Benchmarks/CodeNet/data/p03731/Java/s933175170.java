import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();

        int start = scanner.nextInt();
        int end = start + T;

        int acc = 0;

        if(N==1){
            System.out.println(T);
            return;
        }

        for(int i=0; i<N-1; i++){
            int startTmp = scanner.nextInt();
            int endTmp = startTmp + T;


            if(i==N-2) {
                if(end < startTmp){
                    acc += end - start;
                    acc += endTmp - startTmp;
                }else{
                    acc += endTmp - start;
                }
            } else if(end < startTmp){
                acc += end - start;
                start = startTmp;
                end = endTmp;
            }else{
                end = endTmp;
            }
        }

        System.out.println(acc);
    }
}
