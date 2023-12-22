import java.util.Scanner;	
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner stdIn= new Scanner(System.in);
    int n=stdIn.nextInt();
    int a=n%10;
    int [] hon={2,4,5,7,9};
    int [] pon={0,1,6,8};
    for(int t=0;t<hon.length;t++){
      if(a==hon[t])System.out.println("hon");
    }
    for(int t=0;t<pon.length;t++){
      if(a==pon[t])System.out.println("pon");
    }
    if(a==3)System.out.println("bon");
  }
}
 

    
      
    
    