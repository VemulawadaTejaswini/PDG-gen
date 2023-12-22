import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(cout >= 3){
                if(a == b){
                    count++;
                }else{
                    count = 0;
                }  
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }

       }
   }
}

