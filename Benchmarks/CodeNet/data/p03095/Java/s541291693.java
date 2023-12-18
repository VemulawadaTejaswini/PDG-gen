public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        scanner.nextInt();
        int m[]=new int[26],a=1;
        for(char c:scanner.next().toCharArray())m[c-97]++;
        for(int i=0;i<26;i++)a=a*(m[i]+1)%1000000007;
        System.out.println(--a);
    }
}