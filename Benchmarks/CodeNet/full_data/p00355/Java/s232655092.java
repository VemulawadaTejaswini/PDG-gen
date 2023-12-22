import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int N = scan.nextInt();
        int n = 0;
        int k = 0;

        for (int i = 0; i < N; i++) {

            int f = scan.nextInt();
            int s = scan.nextInt();

            if (a >= s || b <= f) {

                n++;
            } else {
                k++;
            }
        }    
    if(k > 0){
        System.out.println("1");
    } else{
        System.out.println("0");
    }
}
}
