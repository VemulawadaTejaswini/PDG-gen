import java.util.Scanner;

class New {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int k = in.nextInt ();

        if(k <= a){
            System.out.println (a-k+" "+b);
        }else if(k <= a+b){
            System.out.println (0+" "+ (b-(k-a)));
        }else{
            System.out.println (0+" "+0);
        }
    }
}