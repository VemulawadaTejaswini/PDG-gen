import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
       if(H%A ==0){
       int x = H/A;
       System.out.println(x);
      }elseif(H<=A){
       int x = H/A+1;
       System.out.println(x);
       }else{
       int x = H/A+1;
       System.out.println(x);}
	}
}