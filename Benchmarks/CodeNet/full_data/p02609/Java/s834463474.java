import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        String bin = scn.next();
        String[] num;
        num = bin.split("");
        long count;

        for(int i=0;i<num.length;i++){

            String numC[] = num.clone();

            if(numC[i].equals("1")){
                numC[i]="0";
            }else{
                numC[i]="1";
            }

            String bin2 = String.join("",numC);

            long dec = Long.parseLong(bin2, 2);

            long d = dec;
            count =0;

            while(d!=0){
                String temp = Long.toBinaryString(d);
                long c=0;
                for(int l=0;l<temp.length();l++){
                    if(temp.charAt(l)=='1'){
                        c +=1;
                    }
                }
                d=d%c;
                count +=1;

            }

            System.out.println(count);


        }




        scn.close();

    }


}
