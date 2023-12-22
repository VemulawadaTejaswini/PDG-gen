import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int A=stdIn.nextInt();
        int B=stdIn.nextInt();
        int C=stdIn.nextInt();
        int K=stdIn.nextInt();

        int sum=0;
        while(K>0&&A>0){
            sum++;
            A--;
            K--;
        }
        while(K>0&&B>0){
            B--;
            K--;
        }
        while(K>0&&C>0){
            C--;
            K--;
            sum--;
        }
        System.out.print(sum);
        

        
        
        
    }

}