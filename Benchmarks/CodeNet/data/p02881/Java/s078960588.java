import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long min = N;
        for(int i = 1;true;i++){
            for(int j = 1;true;j++){
                if((i*j)==N){
                    if( min > (i-1)+(j-1)){
                        min = (i-1)+(j-1);
                    }
                }
                if((i*j) > N){
                    break;
                }
            }
            if(i > N){
                System.out.println(min);
                return;
            }
        }
    }
}