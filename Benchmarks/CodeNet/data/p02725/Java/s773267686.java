import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int k= input.nextInt();
        int n=input.nextInt();

        int dist1=0,dist2=0;

        //for the first case
        int cur=0,prev=0;

        for (int i = 1; i <= n; i++) {
            prev =cur;
            cur =input.nextInt();

            //if we start moving from the first house, we'll actually start minusing from the second house
            if(i>=2){
                dist1 += cur-prev;
            }

            //if we start moving from the last house. in a real sense, we're starting from the last house
           if(i <n){
               dist2 += cur - prev;
           }


        }
        dist2 += k-cur;

        if(dist1 <dist2){
            System.out.println(dist1);
        }else{
            System.out.println(dist2);
        }

    }
}
