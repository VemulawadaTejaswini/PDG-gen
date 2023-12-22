public class Main{
   public static void main(String[] args){
        System.out.println("辺aの長さを入力してください");
	int a = new java.util.Scanner(System.in).nextInt();
	System.out.println("辺bの長さを入力してください");
        int b = new java.util.Scanner(System.in).nextInt();
        
        int men = a*b;
	int syu = 2*a+2*b;

	System.out.println(men+" "+syu);
   }
}