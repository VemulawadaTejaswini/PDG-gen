import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   while(sc.hasNextInt()){
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   System.out.println(String.valueOf(b+c).length()
);
   }
    }
}