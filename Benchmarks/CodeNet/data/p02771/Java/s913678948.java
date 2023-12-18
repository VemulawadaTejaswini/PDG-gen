public class A_20200216 {
    public static void main(int args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A != B && B != C) {
            System.out.println("No");
        } else if(A == B && B == C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}