import java.util.*;

class Main{
    int[] D;

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int K = scanner.nextInt();

        int L = N.length();

        D = new int[L];
        for(int i=0;i<L;i++) D[i] = Character.getNumericValue(N.charAt(i));

        int R = 0;
        for(int i=0;i<K;i++){
            if(K-i == 1){
                R += D[i];
                R += 9 * (L-i-1);
            } else if(K-i == 2){
                R += (D[i]-1) * 9 * (L-i-1);
                R += 81 * (L-i-1) * (L-i-2) /2;
            } else {
                R += (D[0]-1) * 81 * (L-1) * (L-2) / 2;
                R += 729 * (L-1) * (L-2) * (L-3) / 6;
            }
        }

        System.out.println(R);
    }
}
