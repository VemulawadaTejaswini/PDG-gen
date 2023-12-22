import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static List<Time> list = new ArrayList<Time>();

    static class Time{
        int h,m,s;
        Time(int h,int m,int s){
            this.h=h;
            this.m=m;
            this.s=s;
        }
    }

    public static void main(String[] args) {

        while (true){
            int n=s.nextInt();
            if(n==0)break;
            int trainNum=0;
            int maxNum=0;
            list.clear();


            for(int i=0;i<n;i++) {

                String str = s.next();
                String[] startTime = str.split(":");
                int startH=Integer.parseInt(startTime[0]);
                int startM=Integer.parseInt(startTime[0]);
                int startS=Integer.parseInt(startTime[0]);
                trainNum++;

                str = s.next();
                String[] endTime = str.split(":");
                int endH=Integer.parseInt(endTime[0]);
                int endM=Integer.parseInt(endTime[0]);
                int endS=Integer.parseInt(endTime[0]);
                list.add(new Time(endH,endM,endS));

                for(int j=0;j<list.size();j++){
                    Time temp=list.get(j);
                    if(startH>=temp.h){
                        if(startM>=temp.m){
                            if(startS>=temp.s){
                                trainNum--;
                                list.remove(j);
                            }
                        }
                    }
                }

                if(maxNum<trainNum) maxNum=trainNum;
            }
            System.out.println(maxNum);

        }

    }
}