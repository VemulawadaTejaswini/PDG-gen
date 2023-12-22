import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
   
    int a = n/x;
        
    if(n%x==0){
    	System.out.println(a*t);
    }else{
    	System.out.println((a+1)*t);
    }
}
}