import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Set<Integer>> lampSwitchList = new ArrayList<>();

        for(int i=0; i<m; i++){
            Set<Integer> switchSet = new HashSet<>();
            int k = sc.nextInt();

            for (int j=0; j< k; j++){
                switchSet.add(sc.nextInt());
            }
            lampSwitchList.add(switchSet);
        }

        List<Integer> onLampsNumList = new ArrayList<>();
        for (int i=0; i<m; i++){
            onLampsNumList.add(sc.nextInt());
        }

        int switchPatterns = (int)Math.pow(2, n);
        int count = 0;

        for (int i = 0; i<switchPatterns; i++){
            // スイッチの点灯パターンについて
            boolean[] switchOns = numToBoolArray(i, n);
            boolean isCount = true;

            for (int j=0; j<m; j++){
                // 各ランプについて
                Set<Integer> targetSwitchSet = lampSwitchList.get(j);
                int targetSwitchOnCount = 0;

                for (int k=0; k<n; k++){
                    // 各スイッチについて
                    if (switchOns[k] && targetSwitchSet.contains(k+1)){
                        targetSwitchOnCount +=1;
                    }
                }

                if (targetSwitchOnCount % 2 != onLampsNumList.get(j)){
                    isCount = false;
                    break;
                }
            }

            if (isCount){
                count++;
            }

        }

        System.out.println(count);
    }

    private static boolean[] numToBoolArray(int number, int n){
        boolean[] booleans = new boolean[n];

        String nishinString = Integer.toBinaryString(number);
        String formatedNishinString = String.format("%05d", Integer.parseInt(nishinString));
        char[] oneZeros = formatedNishinString.toCharArray();
        for (int i=0; i < oneZeros.length; i++){
            booleans[i] = oneZeros[i] == '1';
        }

        return booleans;
    }


}