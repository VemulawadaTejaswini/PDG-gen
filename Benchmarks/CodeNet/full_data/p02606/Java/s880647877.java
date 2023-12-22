import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int L = sc.nextInt();
      	int R = sc.nextInt();
      	int d = sc.nextInt();
      	int a = R-L;
      	int g = a/d;
      if(L%d != 0 && R%d !=0){
      	System.out.println(g);
      }else{
      	System.out.println(g+1);
      }
    }
}