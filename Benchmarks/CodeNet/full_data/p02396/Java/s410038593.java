import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int a[];
            int i=0,count=0;
            a = new int[100];
            a[0]=1;
                Scanner num = new Scanner(System.in);
                while(true){
                     a[i] = num.nextInt();
                     if(a[i]!=0){
                         i+=1;
                         count+=1;
                     }else{
                         break;
                     }
                }
                i=0;
                while(count<=i){
                    System.out.println("Case " + i + ": " + a[i]);
                    i++;
                }
        }
    }
