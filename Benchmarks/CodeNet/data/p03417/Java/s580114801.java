import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        long count = 0;
        if(n==1&&m==1)
            count = 1;
        else if(n==1&&m!=1)
            count = m-2;
        else if(n!=1&&m==1)
            count = n-2;
        else if(n>=2)
            count = (n-2)*(m-2);
        System.out.println(count);
        input.close();
    }
}