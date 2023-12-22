import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int a[];
            int i=0,count=1;
            a = new int[100000];
            a[0]=1;
                Scanner n = new Scanner(System.in);
                while(a[i] != 0){
                    i++;
                     a[i] = n.nextInt();
                     if(a[i]!=0){
                         count+=1;
                    }
                }
                i=1;
                while(count>i){
                    System.out.println("Case " + i + ": " + a[i]);
                    i++;
                }
        }
    }
