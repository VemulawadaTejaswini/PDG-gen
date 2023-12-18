import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        int cnt=0;
        while(A<=B){
            if(A%C==0){

            }else if(A%D==0){

            }else{
                cnt++;
            }
            A++;
        }
        System.out.println(cnt);
    }
}