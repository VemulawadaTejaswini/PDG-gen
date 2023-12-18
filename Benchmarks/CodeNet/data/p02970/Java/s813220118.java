import java.util.*; public class Main{ public static void main(String[] args){ Scanner s=new Scanner(System.in); int N=s.nextInt(); int D=s.nextInt(); int check=N/D; int ans=0; if(N<=2*D+1){ System.out.print(1); } else{
System.out.print(N/(2*D+1)) } } } 
