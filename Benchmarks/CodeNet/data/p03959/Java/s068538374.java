import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int BASE = 1000000007;
        int n = sc.nextInt();
        int taka[] = new int [n];
        int ao[] = new int [n];

        for(int i=0;i<n;i++){
            taka[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            ao[i]= sc.nextInt();
        }

        long pattern = 1;
        boolean flag = true;

        for(int i=0;i<n&&flag;i++){
            int max_t=0,min_t=0;
            int max_a=0,min_a=0;

            if(i==0){
                max_t = taka[0];
                min_t = taka[0];
            }
            else{
                if(taka[i]==taka[i-1]){
                    max_t = taka[i];
                    min_t = 1;
                }
                else {
                    max_t = taka[i];
                    min_t = taka[i];
                }
            }

            if(i==n-1){
                max_a = ao[n-1];
                min_a = ao[n-1];
            }
            else{
                if(ao[i+1]==ao[i]){
                    min_a =1;
                    max_a = ao[i];
                }
                else {
                    max_a = ao[i];
                    min_a = ao[i];
                }
            }

            if(max_t<min_a && max_a<min_t){
                flag = false;
            }
            else{
                int tmp = Math.min(max_a,max_t) - Math.max(min_a,min_t)+1;
                pattern *= tmp;
               // pattern = pattern;
            }

        }

        //if(!flag) pattern = 0;

        System.out.println(pattern%BASE);


    }

 }
