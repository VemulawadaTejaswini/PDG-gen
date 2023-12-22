import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num;
        int avg;
        int count;
        while(true){
            avg = 0;
            count = 0;
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            int[] data = new int[num];
            
            for(int i = 0; i < num; i++){
                data[i] = sc.nextInt();
                avg += data[i];
            }
            avg /= num;
            
            for(int i = 0; i < num; i++){
                if(data[i] <= avg){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
