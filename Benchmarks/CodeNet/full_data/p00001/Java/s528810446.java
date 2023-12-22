public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        
        for(int i = 0; i<10; i++)
            a[i] = s.nextInt();
        
        java.util.Arrays.sort(a);
        
        System.out.print("\n" + a[9] + "\n" + a[8] + "\n" + a[7]);
        
    }
}