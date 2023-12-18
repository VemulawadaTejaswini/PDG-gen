public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        String S = s.next();

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
