import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] tmp = scanner.nextLine().split(" ");
        int[] A = new int[N];
        int count=0;
        for (int i = 0; i < N; i++) {
            A[i]=Integer.parseInt(tmp[i]);
        }
        boolean isAllEven=true;
        label:while(isAllEven){
            for (int v:A){
                if(v%2==1){
                    isAllEven=false;
                    break label;
                }
            }
            for (int i = 0; i < N; i++) {
                A[i]=A[i]/2;
            }
            count++;
        }
        System.out.println(count);
    }
}
