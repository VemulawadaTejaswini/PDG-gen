import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        char[] c = s.toCharArray();
        //int a = Integer.parseInt(S[0]);
        //int b = Integer.parseInt(S[1]);
        //int c = Integer.parseInt(S[2]);
        char target = c[k-1];

        for (int i = 0; i < n; i++) {
            if (c[i] != target) {
                c[i] = '*';
            }
        }
        System.out.println(String.valueOf(c));
    } 
}     