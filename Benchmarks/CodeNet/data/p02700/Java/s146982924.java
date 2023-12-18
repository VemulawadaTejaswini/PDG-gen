import java.util.*;  
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
       int a = input.nextInt();
     	int b = input.nextInt();
      int c = input.nextInt();
     	int d = input.nextInt();
      while(a>0||c>0){
         c= c-b;
         if(c<0)
          System.out.println("Yes");
       	a = a-d;
        if(a<0)
          System.out.println("No");
       
      }
    }
}