import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int group1[]={1,3,5,7,8,10,12};
        int group2[]={4,6,9,11};
        int group3[]={2};
        int z,x;
        z=input.nextInt();
        x=input.nextInt();
        int sum1=0,sum2=0,sum3=0;
        boolean m=false;
        if(z==x)
        {
            for(int i=0;i<group1.length;i++)
            {
                if(z==group1[i])
                    sum1++;
            }
            for(int i=0;i<group2.length;i++)
            {
                if(z==group2[i])
                    sum2++;
            }
            if(z==2)
                sum3++;
            if(sum1==1||sum2==1||sum3==1)
            {
                System.out.println("Yes");
                m=true;
            }
            
        }
        else {
            for(int i=0;i<group1.length;i++)
            {
                if(z==group1[i]||x==group1[i])
                    sum1++;
            }
            for(int i=0;i<group2.length;i++)
            {
                if(z==group2[i]||x==group2[i])
                    sum2++;
            }
            
            if(sum1==2||sum2==2||sum3==2)
            {
                System.out.println("Yes");
                m=true;
            }
        }
        if(!m)
        {
            System.out.println("No");
        }
    }
    
}
