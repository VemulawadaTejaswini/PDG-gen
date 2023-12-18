import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
 
    long cou = 0;
    for(long i=1; i<=N; i++){
       if(i*i<=N) {
    	   cou++;
       }
}
 	System.out.println(cou*cou);
    }
}
