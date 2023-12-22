import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int n;

    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    for(int i=1; i<=n; i++){
        int x = i;
        
        if(x%3 == 0){
            System.out.print(" " + i);
        }else{
            while(x>0){
                if(x%10 == 3){
                    System.out.print(" " + i);
                    break;
                }
                x = x/10;
            }
        }
    }
    System.out.println();
  }
}