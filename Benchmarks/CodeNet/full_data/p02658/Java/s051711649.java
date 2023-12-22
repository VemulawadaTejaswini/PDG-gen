import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String N = stdIn.nextLine();
        int n = Integer.parseInt(N);
        String input = stdIn.nextLine();
        String[] inputs = input.split(" ");
        long[] e = new long[n];
        for(int i = 0 ; i < n ; i++){
            e[i] = Long.parseLong(inputs[i]);
        }
        long result = 1;
        if(n > 1 && n <= Math.pow(10 , 5)){
            for(int i = 0 ; i < e.length ; i++){
                result = result*e[i];
            }
            if(result >= 0 && result <= Math.pow(10 , 18)){
                System.out.println(result);
            }else{
                System.out.println("-1");
            }
        }
    }
}
