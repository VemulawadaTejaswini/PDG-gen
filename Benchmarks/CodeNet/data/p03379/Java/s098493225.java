import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        int med1,med2;
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        int[]po2=po.clone();
        Arrays.sort(po);
        med1=po[n/2];
        med2=po[n/2-1];
        for(int i=0;i<n;i++){
            if(med1==med2)System.out.println(med1);
            else{
                System.out.println((med1<=po2[i])?med2:med1);
            }
        }
        
    }
}