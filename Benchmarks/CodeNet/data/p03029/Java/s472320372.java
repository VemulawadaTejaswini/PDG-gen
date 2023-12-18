import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	System.out.print("林檎の数：");
      	Scanner apple = Scanner.nextInt();
      
      	int kakera = apple*3;
      	int applepie = kakera/2;
      
      	System.out.println("作れるアップルパイの数：" + applepie);
    }
}
