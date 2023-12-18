public class Main{

public static void main(String[] args){

		int A1;
  	int A2;
  int A3;
  
  Scanner sc=new Scanner(System.in);
  
  A1=sc.nextInt();
  A2=sc.nextInt();
  A3=sc.nextInt();
  
  if(A1+A2+A3 >= 22)
    System.out.println("bust");
  else
    System.out.println("win");
  		
	}
}