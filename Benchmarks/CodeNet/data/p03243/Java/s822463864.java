public class Main{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[3];
        int minN = 0;
        n[0] = N / 100;
        n[1] = (N - n[0] * 100) / 10;
        n[2] = (N - n[0] * 100 - n[1] * 10);
        minN = Math.max(n[0],n[1]);
        minN = Math.max(minN,n[2]);
        System.out.print(minN);
        System.out.print(minN);
        System.out.println(minN);
    }
}