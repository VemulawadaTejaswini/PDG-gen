import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        long N=n-1;

        long[] name=new long[10000];

        name[1]=26;
        name[2]=(long)Math.pow(26, 2);
        name[3]=(long)Math.pow(26, 3);
        name[4]=(long)Math.pow(26, 4);
        name[5]=(long)Math.pow(26, 5);
        name[6]=(long)Math.pow(26, 6);
        name[7]=(long)Math.pow(26, 7);
        name[8]=(long)Math.pow(26, 8);
        name[9]=(long)Math.pow(26, 9);
        name[10]=(long)Math.pow(26, 10);
        name[11]=(long)Math.pow(26, 11);


        int calN=0;

        if(N>name[10]){
            calN=10;
        }else if(N>name[9){
            calN=9;
        }else if(N>name[8){
            calN=8;
        }else if(N>name[7){
            calN=7;
        }else if(N>name[6){
            calN=6;
        }else if(N>name[5]){
            calN=5;
        }else if(N>name[4]){
            calN=4;
        }else if(N>name[3]){
            calN=3;
        }else if(N>name[2]){
            calN=2;
        }else if(N>name[1]){
            calN=1;
        }else {
            calN=0;
        }

        long i=0;

        long[] keta=new long[100];

        while(calN>=1){
            keta[calN]=N/name[calN];

            if(keta[calN]==0){
                System.out.print("a");
            }else if(keta[calN]==1){
                System.out.print("b");
            }else if(keta[calN]==2){
                System.out.print("c");
            }else if(keta[calN]==3){
                System.out.print("d");
            }else if(keta[calN]==4){
                System.out.print("e");
            }else if(keta[calN]==5){
                System.out.print("f");
            }else if(keta[calN]==6){
                System.out.print("g");
            }else if(keta[calN]==7){
                System.out.print("h");
            }else if(keta[calN]==8){
                System.out.print("i");
            }else if(keta[calN]==9){
                System.out.print("j");
            }else if(keta[calN]==10){
                System.out.print("k");
            }else if(keta[calN]==11){
                System.out.print("l");
            }else if(keta[calN]==12){
                System.out.print("m");
            }else if(keta[calN]==13){
                System.out.print("n");
            }else if(keta[calN]==14){
                System.out.print("o");
            }else if(keta[calN]==15){
                System.out.print("p");
            }else if(keta[calN]==16){
                System.out.print("q");
            }else if(keta[calN]==17){
                System.out.print("r");
            }else if(keta[calN]==18){
                System.out.print("s");
            }else if(keta[calN]==19){
                System.out.print("t");
            }else if(keta[calN]==20){
                System.out.print("u");
            }else if(keta[calN]==21){
                System.out.print("v");
            }else if(keta[calN]==22){
                System.out.print("w");
            }else if(keta[calN]==23){
                System.out.print("x");
            }else if(keta[calN]==24){
                System.out.print("y");
            }else if(keta[calN]==25){
                System.out.print("z");
            }
            N=N/name[calN];
            calN--;
        }
        calN=0;
        
        
        if(keta[calN]==0){
            System.out.print("a");
        }else if(keta[calN]==1){
            System.out.print("b");
        }else if(keta[calN]==2){
            System.out.print("c");
        }else if(keta[calN]==3){
            System.out.print("d");
        }else if(keta[calN]==4){
            System.out.print("e");
        }else if(keta[calN]==5){
            System.out.print("f");
        }else if(keta[calN]==6){
            System.out.print("g");
        }else if(keta[calN]==7){
            System.out.print("h");
        }else if(keta[calN]==8){
            System.out.print("i");
        }else if(keta[calN]==9){
            System.out.print("j");
        }else if(keta[calN]==10){
            System.out.print("k");
        }else if(keta[calN]==11){
            System.out.print("l");
        }else if(keta[calN]==12){
            System.out.print("m");
        }else if(keta[calN]==13){
            System.out.print("n");
        }else if(keta[calN]==14){
            System.out.print("o");
        }else if(keta[calN]==15){
            System.out.print("p");
        }else if(keta[calN]==16){
            System.out.print("q");
        }else if(keta[calN]==17){
            System.out.print("r");
        }else if(keta[calN]==18){
            System.out.print("s");
        }else if(keta[calN]==19){
            System.out.print("t");
        }else if(keta[calN]==20){
            System.out.print("u");
        }else if(keta[calN]==21){
            System.out.print("v");
        }else if(keta[calN]==22){
            System.out.print("w");
        }else if(keta[calN]==23){
            System.out.print("x");
        }else if(keta[calN]==24){
            System.out.print("y");
        }else if(keta[calN]==25){
            System.out.print("z");
        }

        //END
    }
}



