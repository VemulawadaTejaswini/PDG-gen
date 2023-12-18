import java.util.Scanner;
import java.lang.Math;
public class test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        long h=scan.nextInt();
        int n=scan.nextInt();
      	int []arr=[n];
      for (int i=0;i<n;i++){
      arr[i]=scan.nextInt();
        h-=arr[i];       
      }
      if (h<0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
        }
    }
