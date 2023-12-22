import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String bin = scn.next();
        int count;

        for(int i=0;i<n;i++){

            char[] num;
            num = bin.toCharArray();

            if(num[i]=='1'){
                num[i]='0';
            }else{
                num[i]='1';
            }

            String bin2 = new String (num);


            long dec = Long.parseLong(bin2, 2);

            long d = dec;
            count =0;

            while(d!=0){
                int c=Long.bitCount(d);
                d=d%c;
                count +=1;

            }



            System.out.println(count);


        }




        scn.close();

    }


}
