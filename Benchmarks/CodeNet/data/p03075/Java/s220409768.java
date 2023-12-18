import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=sc.nextInt();
      int k=sc.nextInt();
      
      int meters[]={a,b,c,d,e};
      
      for(int i=0;i<4;i++){
        if ((meters[i+1]-meters[i])>k){
          System.out.println(":(");
          break;
        }
          System.out.println("Yay!");
      }
      
    }
	
}