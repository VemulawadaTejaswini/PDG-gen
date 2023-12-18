import java.util.*;



public class Main {
    public static int getwater(int sugar, int x, int y, int exy){
        int max=(int)Math.ceil(sugar/(double)exy);
        int m1,m2;
        if (x>=y){
            m1=x;
            m2=y;
        }
        else{
            m1=y;
            m2=x;

        }

        int result=m1*max/m1+m2*(int)Math.ceil((max-m1*(max/m1))/(double)m2);

        return result;

    }

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a =reader.nextInt();
        int b=reader.nextInt();
        int c=reader.nextInt();
        int d=reader.nextInt();
        int ee=reader.nextInt();
        int f=reader.nextInt();

        int m= (int) Math.floor(f/((100/(double)ee)+1));
        double maxPer;
        int res1=1,res2=0;
        int count1=0;
        int count2=0;
        while(count1*c+count2*d < m){
            while(count1*c+count2*d < m){
                int SUGAR=count1*c+count2*d;
                if ((SUGAR+100*getwater(SUGAR,a,b,ee))>f)
                    break;
                maxPer=(count1*c+count2*d)/(double)(count1*c+count2*d+100*getwater(SUGAR,a,b,ee));
                if (maxPer<=(ee/(double)(ee+100))&&maxPer>res2/(double)(res1+res2)){
                    res1=100*getwater(SUGAR,a,b,ee);
                    res2=SUGAR;
                }
                count2++;
            }
            count1++;
        }
        System.out.println((res1+res2)+" "+res2);


    }
}
