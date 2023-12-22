//import java.util.Scanner;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
    Scanner var = new Scanner(System.in);
    int a,b;
    String op;
  do {
    a = var.nextInt();
    op=var.next();
    b=  var.nextInt();
    if(op=="+"){
    System.out.println(a+b);
    }else if (op=="-"){
    System.out.println(a-b);
    }else if(op=="*"){
    System.out.println(a*b);
    }else if(op=="/"){
    System.out.println((float)(a/b));
    }else if(op=="?"){
      break;
    }
  }while(op != "?");
	}
}