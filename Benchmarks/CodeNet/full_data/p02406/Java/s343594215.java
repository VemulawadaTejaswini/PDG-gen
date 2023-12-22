public class Main {
    public static void main(String[] args) {
       
        int n = 30;
        
        for (int i = 1; i <= n; i ++) {
            if (i % 3 == 0 || i % 10 == 3) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
