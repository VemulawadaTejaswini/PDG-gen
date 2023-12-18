import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i = 1;true;i++){
            for(int j = 1;true;j++){
                if((i*j)==N){
                    System.out.println(i*j);
                }
                if((i*j) > N){
                    break;
                }
            }
        }
    }
}