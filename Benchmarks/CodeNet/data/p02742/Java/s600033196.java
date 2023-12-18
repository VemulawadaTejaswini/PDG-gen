import java.util.Scanner;
 
class Main{
  public static void main(final String[] args){
    
    final Scanner scanner = new Scanner(System.in);
    final int H = scanner.nextInt();
    final int M = scanner.nextInt();
    long count;
    if(H % 2 == 0 && M % 2 == 0){
        System.out.println((H*M)/2);
    }else if(H == 1 && M == 1){
        System.out.println(1);
    }else if(H % 2 == 1 && M % 2 == 1){
        /*mx = max(H,M);
        mn = min(H,M);
        c = mn/2;
        count = mx*c + (mx/2);*/
        count = ((H*M)/2) + 1;
        System.out.println(count);
    }else{
        System.out.println((H*M)/2);
    }

    
    
    
    
    
    }
}