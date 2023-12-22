import java.util.Scanner;

class Main{
public static void main(String[] args){

	Scanner s = new Scanner(System.in);
    int a=s.nextInt();	
    int b=s.nextInt();
    float c= (float)a/b;
    
   System.out.println(a/b+a%b+c);
	}
	
}


