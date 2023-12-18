import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        long maxcount =0;
        long count= 0;
        for(int i=1;i<n;i++){
            if(input[i-1] >= input[i]){
                count++;
            }else{
                if(maxcount < count){
                    maxcount = count;
                }
                count=0;
            }
        }

        if(maxcount < count){
            maxcount = count;
        }


        System.out.println(maxcount);



    }
    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }


}