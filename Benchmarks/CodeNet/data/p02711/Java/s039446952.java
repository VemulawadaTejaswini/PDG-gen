import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
if(N>=100&&N<=999){
    String s=String.valueOf(N);
    if(s.contains("7"))
        System.out.println(" Yes ");
    else
        System.out.println(" No ");     
}
    } 
}