import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int K;
        String Str;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();
            Str = sc.next();
        }
        long result = 0;
        long count = 0;
        long happy =0;
        for(int i = 0;i < N-1;i++){
            if(Str.charAt(i) != Str.charAt(i+1)){
                count++;
            }else{
                happy++;
            }
        }
        if( 2* K < count){
            happy += 2*K;
        }else{
            happy += count;
        }
        System.out.println(happy);
    }


}
