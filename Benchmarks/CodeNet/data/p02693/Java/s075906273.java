import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());


        int count=0;
        for(int i=A; i<=B; i++){
            if(i % K == 0){
                count++;
            }
        }

        if(count != 0){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        sc.close();
    }
    
}