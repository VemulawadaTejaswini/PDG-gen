import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> H = new ArrayList<Integer>(N);

        boolean ans = true;
        for (int i=0;i<N;i++){
            H.add(i,scanner.nextInt());
        }

        for (int i=N-1;i>0;i--){
            if (H.get(i)<H.get(i-1)) {
                if (H.get(i-1)-H.get(i)>=2) {
                    ans = false;
                    break;
                }
                H.set(i-1, H.get(i - 1)-1);
            }
        }

        if (ans) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}