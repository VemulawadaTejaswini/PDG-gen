import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt(); long total=1;
      long ar[]=new long[n];
      if (n==1){
        System.out.println(total);
      }
      else{
       for (int i=1;i<n;i++){
       if (ar[i-1]>ar[i]){
       total+=1;
       }
       }
        System.out.println(total);
      }
        }
    }
    
