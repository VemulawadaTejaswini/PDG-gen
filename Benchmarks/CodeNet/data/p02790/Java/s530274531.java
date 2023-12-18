import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        
        if(a >= b){
          for(int i = 1;i <= a;i++){
            System.out.print(b);
          }
        }else{
          for(int i = 1;i <= b;i++){
            System.out.print(a);
          }
        }
	}
}