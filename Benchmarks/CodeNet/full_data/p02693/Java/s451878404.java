import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int k = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        boolean c=false;
        if(a-b>=k){
            c=true;
        }else{
            for(int i=a;i<=b;i++){
                if(i%k==0){
                   c=true; 
                }
            }
        }
        if(c){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}