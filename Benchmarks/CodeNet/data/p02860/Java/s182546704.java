public class Atcoder{
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        String S = new java.util.Scanner(System.in).nextLine();
        String T = S.substring(N/2);
            System.out.println(T);
        if(S.equals(T + T)){
            System.out.println("Yes");
        }
        else System.out.println("No");
        }
    }
}