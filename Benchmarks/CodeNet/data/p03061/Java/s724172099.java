import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> valueList = new ArrayList<>();
        for (int i=0; i<n; i++){
            valueList.add(sc.nextInt());
        }

        if (n == 2){
            System.out.println(Math.max(valueList.get(0), valueList.get(1)));
        }else {
            int[] leftGCM = new int[n];
            int[] rightGCM = new int[n];

            for (int i=0; i<n; i ++){
                if (i == 0){
                    leftGCM[0] = valueList.get(0);
                    rightGCM[n-1] = valueList.get(n-1);
                }else {
                    leftGCM[i] = getGCM(valueList.get(i), leftGCM[i-1]);
                    rightGCM[n-1-i] = getGCM(valueList.get(n-1-i), rightGCM[n-i]);
                }
            }

            int maxGCM = 1;
            for (int i=0; i<n; i++){
                if (i == 0){
                    int gcm = rightGCM[i+1];
                    if (gcm > maxGCM){
                        maxGCM = gcm;
                    }
                }else if (i == n-1){
                    int gcm = leftGCM[i-1];
                    if (gcm > maxGCM){
                        maxGCM = gcm;
                    }
                }else {
                    int gcm = getGCM(leftGCM[i-1], rightGCM[i+1]);
                    if (gcm > maxGCM){
                        maxGCM = gcm;
                    }
                }
            }

            System.out.println(maxGCM);

        }
    }

    private static int getGCM(int a, int b){
        int larger = Math.max(a, b);
        int gcm = Math.min(a, b);

        if (gcm == 0){
            return larger;
        }

        while (larger % gcm != 0){
            int smaller = gcm;
            gcm = larger % gcm;
            larger = smaller;
        }

        return gcm;
    }
}