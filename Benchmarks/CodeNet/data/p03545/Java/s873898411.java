import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] abcd = new int[4];

        for(int i=0;i<4;i++)abcd[i]=Integer.parseInt(s.substring(i,i+1));

        for(int i=0;i<Math.pow(2,3+1);i++){
            int  temp = i;
            boolean[] bit = new boolean[3];
            for(int j=0;j<3;j++){
                bit[j]=temp%2==1;
                temp=temp>>1;
            }
            

            int fugou = 1;
            int ans=abcd[0];

            for(int j=0;j<3;j++){
                if(!bit[j])fugou=-1;
                else fugou = 1;
                ans+=fugou*abcd[j+1];

            }

            if(ans==7){

                for(int j=0;j<3;j++){
                    System.out.print(abcd[j]);
                    System.out.print(bit[j]?"+":"-");
                }
                System.out.println(abcd[3]+"=7");
                return;
            }


        }
    }

}
