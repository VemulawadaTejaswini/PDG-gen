
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int t=sc.nextInt();
        ArrayList<Integer> total=new ArrayList<Integer>();
        for (int i = 0; i < t; i++) {
            total.add(sc.nextInt());
        }
        int count=0;
        int lastTime=-1;
        for (int i = 0; i < k; i++) {
            int max=0;
            int numOfM=0;
            for (int j = 0; j < total.size(); j++) {
                if (total.size()<1) {
                    if (total.get(j)!=0) {
                        max=j;
                        j=total.size();
                    } 
                }else if (total.get(j)>numOfM&&j!=lastTime) {
                    max=j;
                    numOfM=total.get(max);
                }
            }
            if (max!=lastTime) {
                count++;
            }
            lastTime=max;
            total.set(max, total.get(max)-1);
            if (total.get(max)==0) {
                total.remove(max);
                lastTime++;
            }
            numOfM=0;
            max=0;
        }
        System.out.println(k-count);
    }
}
