import java.util.Scanner;

 class A {
    public static void main(String[] args) {
        int n, m;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        m=input.nextInt();
        int sum = 0;
        int [] b= new int[n];
        for (int i = 0; i < n; ++i) {
            b[i]=input.nextInt();
            sum += b[i];
        }

        int cnt = 0;
        for (int i = 0; i < n; ++i) {
            if (b[i] * 4*m >= sum) ++cnt;
        }
        if(cnt>=m)
        System.out.println("Yes");
        else
            System.out.println("No");
    }
}