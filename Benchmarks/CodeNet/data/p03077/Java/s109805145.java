import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] input=new long[5];
        long n=sc.nextLong();
        long mintime=Long.MAX_VALUE;
        for(int i=0;i<5;i++){
            input[i]=sc.nextInt();
            if(input[i]<mintime){
                mintime=input[i];
            }
        }
        System.out.println((n%mintime==0?n/mintime:n/mintime+1)+4);
        
    }
}