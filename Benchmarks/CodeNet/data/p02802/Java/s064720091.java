
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int countA = 0;
        int countW = 0;
        for(int i = 0; i < m; i++){
            int index = sc.nextInt();
            String res = sc.next();
            if(arr[index-1] == 1) continue;
            if(arr[index-1] == 0){
                if(res.equals("WA")){
                    countW+=1;
                }
                if(res.equals("AC")){
                    arr[index - 1]=1;
                    countA++;
                }
            }
        }
        System.out.println(countA);
        System.out.println(countW);

    }
}
