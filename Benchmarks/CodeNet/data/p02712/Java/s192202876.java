import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int i=0,sum=0;
        for(i=1;i<=N;i++){
            if(i % 3 == 0){
            }
            else if(i % 5 == 0){
            }
            else if(i % 3 == 0 && i % 5 == 0){
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
