import java.io.*
import java.util.*

    public class Main {
    public static void main(String[] args)
    throws java.io.IOException{
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int count =1;
            int n = scan.nextInt();
            //if(n==1){System.out.println(0);continue;}
            boolean [] prime = new boolean [n+1];
            for(boolean b :prime)
                b = true;

            for(int i=2;i<=n;i++){
                if(prime[i]){
                    count++;

                    for(int k=i*2;k<=n;k+=i)prime[k]=false;
                }
            }
            System.out.printl(count);
        }
    }
    }