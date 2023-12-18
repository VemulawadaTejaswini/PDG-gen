import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a =sc.nextInt();
      	int b = sc.nextInt();
      int c = sc.nextInt();
        int d = sc.nextInt();
      int count =1;
      while (a>0 && c>0 ){
      	if(count%2==0){
          c=c-b;
        }
        else
          a=a-d;
        count++;
      }
      if(a==0 || a<0)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}