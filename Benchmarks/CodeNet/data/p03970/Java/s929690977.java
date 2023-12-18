public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        if(N < 1 || N > 100000) {
            throw new IllegalArgumentException();
        }

        Scanner s2 = new Scanner(System.in);
        int A = s2.nextInt();
        if(A < 1 || A > 100000) {
            throw new IllegalArgumentException();
        }

        Scanner s3 = new Scanner(System.in);
        int B = s3.nextInt();
        if(B < 1 || B > 100000) {
            throw new IllegalArgumentException();
        }

        Scanner s4 = new Scanner(System.in);
        String S = s4.nextLine();
        if(S.length() != N) {
            throw new IllegalArgumentException();
        }

        int count = 0;
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'a' && count < A + B) {
                count++;
                System.out.println("Yes");
            } else if(S.charAt(i) == 'b' && count < A + B && count <= B) {
                count++;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}