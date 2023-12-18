import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N =stdIn.nextInt();

        int[] FB = new int[N];
        int sum=0;

        for(int i = 0; i < N; i++){
            if(i%3 ==0 && i%5 ==0){
                FB[i] = 0;
            }
            else if(i%3 ==0 && i%5 !=5){
                FB[i] = 0;
            }
            else if(i%3 != 0 && i%5 == 0 ){
                FB[i] = 0;
            }   
            else{
                sum += i;
            }
        }
        
        System.out.print(sum);

    }

}