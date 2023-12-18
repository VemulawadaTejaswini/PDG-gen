import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args){
        int target = 0;

        try {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            target = Integer.parseInt(reader.readLine());
        }catch (Exception E){
            E.printStackTrace();
        }

        int min1 = (int)(Math.pow(target/2,1.0/5));
        int max1 = (int)(Math.pow(target,1.0/5));

        int a = max1;

        int judge = 1;
        while (a>=min1){
            double b=Math.pow(target-Math.pow(a,5),1/5);
            if(b-(int)(b)==0.0){
                System.out.print(a);
                System.out.print(" "+(-(int)(b)));
                judge = 0;
                break;
            }
            a-=1;
        }


        a=max1;
        if (judge==1){
            while (Math.pow(a,5)-Math.pow(a-1,5)<=target) {
                double b = Math.pow(target + Math.pow(a, 5), 1 / 5);
                if (b - (int) (b) == 0.0) {
                    System.out.print(a);
                    System.out.print((int)(b));
                    break;
                }
                a+=1;
            }
        }

    }
}
