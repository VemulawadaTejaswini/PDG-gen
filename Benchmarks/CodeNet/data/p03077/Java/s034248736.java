import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        long totalTime = 0;
        long waitTime = 0;
        for(int i = 0; i < 5; i++){
            long tmpTime = sc.nextLong();
            long tmpTotal = 0;
            if(i == 0){
                tmpTotal = total;
                waitTime = (total / tmpTime);
            }else{
                tmpTotal = total - ((totalTime - 1) * tmpTime);
                waitTime = tmpTotal / tmpTime;
            }
            if(tmpTotal % tmpTime == 0){
                waitTime -= 1;
            }
            if(waitTime < 0){
                waitTime = 0;
            }
            totalTime += waitTime + 1;
        }
        System.out.println(totalTime);
    }
}