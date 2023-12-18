import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //List<String> NList = new ArrayList<String>();
        //int[] Narray = new int[N];
        int sum = 0;

        for(int i=0; i <= N ;i++){
            if(i%3 == 0 || i%5 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}