import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
      	Boolean Success=false;
      	for(int i=1;i<=9;i++)
        {
          if(number/i>10 && number%i==0)
            Success=false;
          else if(number/i<10 && number%i==0)
            Success=true;
        }
      if(Success==true)
         System.out.print("Yes");
      else
        System.out.print("No");
    }
}