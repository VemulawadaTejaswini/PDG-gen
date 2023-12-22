import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            double ave=0;
            double var=0;
            int n=sc.nextInt();
            if(n==0)break;
            int s[]=new int [n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextInt();
                ave+=s[i];
            }
            ave/=n;
            for(int i=0;i<n;i++){
                var+=(s[i]-ave)*(s[i]-ave);
            }
            var/=n;
            System.out.println(Math.sqrt(var));



        }
}

}

