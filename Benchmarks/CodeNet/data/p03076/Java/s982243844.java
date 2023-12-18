import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int num[]=new int[5];
        for(int i=0;i<n;i++)num[i]=sc.nextInt();
        int count=10000;
        int num2[]=new int[5];
        for(int i=0;i<n;i++){num2[i]=num[i];while(num2[i]%10!=0)num2[i]++;}
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i==j)c+=num[j];
                else c+=num2[j];
            }
            count=Math.min(c,count);
        }
        System.out.println(count);
    }
}
