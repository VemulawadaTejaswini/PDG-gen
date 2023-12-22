import java.util.Scanner;
 
class Main{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   int a = scanner.nextInt();
   int b = scanner.nextInt();
   int c = scanner.nextInt();
   int d = scanner.nextInt();
   
   int[] a= new int[]{a*c,a*d,b*c,b*d};
   
   int num = a[0];
   
   for(int i=1;i<4;i++) if(num > a[i]) num = a[i];
   
   System.out.println(num);
   
 }
   
}