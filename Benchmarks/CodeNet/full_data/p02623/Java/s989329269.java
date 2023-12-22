import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int firstar=in.nextInt();
        int far[]=new int[firstar];
        int secondar=in.nextInt();
        int sar[]=new int[secondar];
        int tle=in.nextInt();
        for (int i = 0; i <firstar; i++) {
            far[i]=in.nextInt();
        }
        for (int i = 0; i <secondar; i++) {
            sar[i]=in.nextInt();
        }
        long sum=0; int hand=0,count=0;
        if(firstar<secondar){
            for (int i = 0; i <firstar; i++) {
                if(far[i]<=sar[hand]){
                    sum=sum+far[i];
                }else{
                    sum=sum+sar[hand];
                    hand++;
                    i--;
                }
                if(sum<=tle){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
        else{
            for (int i = 0; i <secondar; i++) {
                if(far[i]<=sar[hand]){
                    sum=sum+far[i];
                }else{
                    sum=sum+sar[hand];
                    hand++;
                    i--;
                }
                if(sum<=tle){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);            
        }
    }
}