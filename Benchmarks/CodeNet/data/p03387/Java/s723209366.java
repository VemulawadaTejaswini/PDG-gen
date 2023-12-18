import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int max = a;
        int cnt = 0;

        if(max < b)
            max = b;
        if(max < c)
            max = c;

        int xa = max - a;
        int xb = max - b;
        int xc = max - c;

        cnt = (xa + xb + xc) / 2;

        if((xa + xb + xc) % 2 == 1)
            System.out.println(cnt + 2);
        else
            System.out.println(cnt);
    }
}