import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int i=0;
        BigDecimal calc= BigDecimal.valueOf(1);

        BigDecimal littleBig= new BigDecimal("1000000000");
        BigDecimal tooBig= new BigDecimal("1000000000000000000");
        BigDecimal zero=BigDecimal.valueOf(0);

        outside:for(i=0;i<N;i++){
            float A=sc.nextFloat();
            BigDecimal a= BigDecimal.valueOf(A);


            int bef=calc.compareTo(littleBig);

            int count=0;

            if(bef==1){
                count++;

                if(count==2){
                    for(int j=i+1;j<N;j++){
                        int B=sc.nextInt();
                        
                        if(B==0){
                            System.out.println("0");
                            break outside;
                        }
                    }

                }
            }



            int pre=a.compareTo(zero);

            if(pre==0){
                System.out.println("0");
                break;
            }


            calc=a.multiply(calc);

            int ans=calc.compareTo(tooBig);

            if(i==N-1&&ans==1){
                System.out.println("-1");
                break;
            }
            if(i==N-1){
                System.out.println(calc.add(zero));
            }
        }


        //END
    }
}

