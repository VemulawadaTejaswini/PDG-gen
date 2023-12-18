import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        int N =scanner.nextInt();
        int K =scanner.nextInt();
        int M =scanner.nextInt();
        int score=0;
        for(int i =1; i<N;i++){
             score =score+ scanner.nextInt();
        }
        int average=N*M;
        int required=average-score;
        if(required>K){
            System.out.println("-1");
        }else if(required<0)
        {
            System.out.println("0");
        }else{
        System.out.println(required);
        }

    }
}




