import java.util.Scanner;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int a,b,c;
      	a = sc.nextInt();
      	b = sc.nextInt();
      	c = sc.nextInt();
      	double div1 = a/c;
      	double div2 = b/c;
      	if(Math.abs(div1-div2)>=1){
        	System.out.println("OK");
        }else{
        	System.out.println("NG");
        }
    }
}