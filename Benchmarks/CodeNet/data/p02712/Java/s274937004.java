import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean enable=false;
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long sum=0;
        for(long i=1;i<=l;i++){
            if(i%3 ==0 || i%5==0){
                continue;
            }
            sum +=i;
        }
        System.out.println(sum);
    }

}