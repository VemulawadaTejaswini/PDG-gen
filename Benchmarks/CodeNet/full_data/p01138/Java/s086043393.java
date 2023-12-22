import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            int n=s.nextInt();
            if(n==0)break;
            int trainNum=0;
            int maxNum=0;
            int[] startTrain = new int[n];
            int[] endTrain = new int[n];

            for(int i=0;i<n;i++) {
                String str = s.next();
                String[] startTime = str.split(":");
                int startH =Integer.parseInt(startTime[0]);
                int startM=Integer.parseInt(startTime[0]);
                int startS=Integer.parseInt(startTime[0]);
                startTrain[i]=startH*3600+startM*60+startS;

                str = s.next();
                String[] endTime = str.split(":");
                int endH=Integer.parseInt(endTime[0]);
                int endM=Integer.parseInt(endTime[0]);
                int endS=Integer.parseInt(endTime[0]);
                endTrain[i]=endH*3600+endM*60+endS;
            }

            Arrays.sort(startTrain);
            Arrays.sort(endTrain);

            int j=0;
            for (int i=0;i<n;i++){
                trainNum++;
                for(;j<i;j++){
                    if(startTrain[i]<endTrain[j]) break;
                    trainNum--;
                }
                if(maxNum<trainNum) maxNum=trainNum;
            }

            System.out.println(trainNum);
        }
    }
}