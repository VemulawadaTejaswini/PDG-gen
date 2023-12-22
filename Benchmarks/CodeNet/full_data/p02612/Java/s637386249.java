import java.util.Scanner;

public class Main {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int oturi=N;
        for(int i=0; i<N;i++){
            oturi= N-i*1000;
            if(oturi<1000){
                break;
            }
        }
        System.out.println(oturi);

    }
}

