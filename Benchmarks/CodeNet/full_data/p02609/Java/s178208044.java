import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String bin = scn.next();
        String[] num = new String[n];
        num = bin.split("");
        int count;

        for(int i=0;i<n;i++){

            String numC[] = num.clone();

            if(numC[i].equals("1")){
                numC[i]="0";
            }else{
                numC[i]="1";
            }

            String bin2 = String.join("",numC);

            long dec = Integer.parseInt(bin2, 2);

            long d = dec;
            count =0;

            while(d!=0){
                String temp = Long.toBinaryString(d);
                int c=0;
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
