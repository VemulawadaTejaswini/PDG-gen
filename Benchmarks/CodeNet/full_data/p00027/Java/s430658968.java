
import java.util.*;

public class Main {
  public static int M;
  public static int N;
    public static void main(String[] args) throws java.io.IOException{
    	
        Scanner scan = new Scanner(System.in);
        while(true){
        double mm = scan.nextInt();
        double dd = scan.nextInt();
        if(mm==0 && dd ==0)break;
        int J=20;
        int K=4;
        if(mm==1 || mm==2){mm+=12;K--;}
        switch ((K+K/4+J/4+5*J+(int)dd+(int)((mm+1)*26/10))%7){
        
        case 1:System.out.println("Sunday");break;
        case 2:System.out.println("Monday");break;
        case 3:System.out.println("Tuesday");break;
        case 4:System.out.println("Wednesday");break;
        case 5:System.out.println("Thursday");break;
        case 6:System.out.println("Friday");break;
        case 0:System.out.println("Saturday");break;
        
        }
        
        }
    }
}