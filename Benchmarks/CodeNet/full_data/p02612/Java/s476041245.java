import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
         int a =Integer.parseInt(str);
         //int z=a/1000
		// int b = 1;
        if(a%1000==0){
          System.out.println(0);}
        
      else if(a%1000>0){
        int z=1;
        int b= a/1000;
        
            System.out.println((z+b)*1000-a);
       }
      }
        
        
	}