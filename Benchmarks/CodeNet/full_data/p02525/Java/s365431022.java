import java.util.*;

 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumsum=0;
        int sum=0;
        double dev=0;
        int x;
        

 
        while (n!=0){
            for(int i=0;i<n;i++){
            x = sc.nextInt();
            sum=sum+x;
            sumsum=sumsum+x*x;
            

        }
            dev=Math.sqrt((sumsum-sum*sum/n)/n);

            System.out.printf("%f\n",dev);
            sum=0;
            sumsum = 0;
            n = 0;
            x = 0;
    
            n = sc.nextInt();

        }
            
            

        }
    }


    