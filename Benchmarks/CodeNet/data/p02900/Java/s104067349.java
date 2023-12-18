import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        int i=0;
        int j=0;
        int count=0;

        int kys[]=new int[A+B];
        int k=0;

        if(A<B){
            outloopA:
            for(i=1;i<=A;i++){
                if(A%i==0&&B%i==0){  //公約数かチェック
                    System.out.println(i);

                    kys[k]=i;

                    if(k==0||k==1){
                        count++;
                        System.out.println("小さい公約数"+i);
                    }else{
                        for(j=1;j<=k-1;j++){
                            if(kys[k]%kys[j]==0){
                                System.out.println("NOT素"+i);
                                break outloopA;
                            }
                            if(j==k-1){
                                count++;
                            }
                        }
                    }

                    k++;


                    /*if(i==1||i==2){
                        System.out.println("小さい公約数");
                        count++;
                        break;
                    }else{
                        for(j=2;j<=i-1;j++){
                            if(i%j==0){
                                break outloopA;
                            }
                            if(j==i-1){
                                count++;
                            }
                        }
                    }*/
                }
            }
        }else{
            outloopB:
            for(i=1;i<=B;i++){
                if(A%i==0&&B%i==0){
                    if(i==1||i==2){
                        count++;
                        break;
                    }else{
                        for(j=2;j<=i-1;j++){
                            if(i%j==0){
                                break outloopB;
                            }
                            if(j==i-1){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

        //END
    }
}
