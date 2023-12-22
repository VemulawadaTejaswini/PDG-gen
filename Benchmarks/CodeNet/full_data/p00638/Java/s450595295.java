

import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            int n = scanner.nextInt();
            if (n==0) break;

            List<Island> islands = new ArrayList<>();
            for (int i =0; i<n; i++){
                islands.add(new Island(scanner.nextInt(),scanner.nextInt()));
            }

            Collections.sort(islands);
            int sum = 0;
            boolean isOverLoad = false;
            for (int i=0; i<n; i++){
                sum += islands.get(i).treasure;
                if (sum > islands.get(i).amountBridge){
                    isOverLoad = true;
                    break;
                }
            }
            if (isOverLoad){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }


        }
    }
}

class Island implements Comparable<Island>{
    int treasure;
    int amountBridge;

    public Island(int treasure, int amountBridge) {
        this.treasure = treasure;
        this.amountBridge = amountBridge;
    }


    @Override
    public int compareTo(Island o) {
        return amountBridge-o.amountBridge;
    }
}

