import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextInt();

        //List<String> NList = new ArrayList<String>();
        //int[] Narray = new int[N];
        long sum = 0;

        for(long i=0; i <= N ;i++){
            if(i%3 == 0 || i%5 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}