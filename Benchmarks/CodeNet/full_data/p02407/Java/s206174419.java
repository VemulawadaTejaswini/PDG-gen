public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] intArray = new int[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            intArray[i] = b;
        }
        for (int kuri = 0; kuri < a - 1; kuri++) {
            for (int i = 0; i < a - 1; i++) {
                if (intArray[i] < intArray[i + 1]) { 
                    int c;
                    c = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = c;
                }
            }
        }
        for (int k = 0; k < a - 1; k++) {
            System.out.print(intArray[k] + " ");
        }
        System.out.print(intArray[a - 1]);
    }
}