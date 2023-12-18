import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        boolean flag = true;
        for(int i =0;i < N;i++){
            int num = Integer.parseInt(sc.next());
            if(num %2 == 0){
                if(num %3 == 0 || num %5 == 0){
                }else{
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}