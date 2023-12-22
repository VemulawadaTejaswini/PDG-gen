import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
            int sum=0;
            double sqsum=0;
            int n=sc.nextInt();
            if(n==0) break;
            int[] score = new int[n];
            for(int i=0;i<score.length;i++){
                score[i]=sc.nextInt();
                sum+=score[i];
                }
                double ave=0,bunsan=0;
                ave=(double) sum/n;
                for(int i=0;i<score.length;i++){
                    sqsum+=(score[i]-ave)*(score[i]-ave);
                }
                bunsan=(double) sqsum/n;
                System.out.println(Math.sqrt(bunsan));
            }
        }   
    }
}
