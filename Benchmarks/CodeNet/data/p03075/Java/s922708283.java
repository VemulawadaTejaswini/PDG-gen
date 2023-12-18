import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[5];
        for (int i=0; i<5; i++) {
            array[i] = sc.nextInt();
        }

        int K = sc.nextInt();
        boolean is_ok = true;
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                int dist = Math.abs(array[i] - array[j]);
                if (dist < K) {
                    is_ok = false;
                    break;
                }
            }
        }
        if (is_ok) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}