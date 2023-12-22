import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] dates = {"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
        while(true){
            int M = sc.nextInt();
            int D = sc.nextInt();
            if(M == 0 && D == 0)
                break;
            int count = -1;
            for(int i = 0 ; i < M-1 ; i++)
                count += days[i];
            count += D;
            System.out.println(dates[count % 7]);
        }
    }
}
