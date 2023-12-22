import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int mille=dayCulc(1000,1,1);

        while (n--!=0){
            int year=s.nextInt();
            int month=s.nextInt();
            int day=s.nextInt();

            int sum=dayCulc(year,month,day);

            System.out.println(mille-sum);
        }
    }

    static int dayCulc(int year,int month,int day){
        int sum=0;
        for(int i=1;i<year;i++){
            if(i%3==0)
                sum+=200;
            else
                sum+=195;
        }

        for(int j=1;j<month;j++){
            if(j%2==1 || year%3==0)
                sum+=20;
            else
                sum+=19;
        }
        sum+=day;

        return sum;
    }
}