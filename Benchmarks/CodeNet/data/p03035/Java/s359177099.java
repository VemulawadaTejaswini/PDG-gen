import java.util.Scanner;

 class Main {
    public static void Main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();            
        int a=0;
        int b=100;
        int res ;

        if (a<=5) {
        	res = 0;            	
        }else if (a<=12) {
        	res = b/2; 
        }else {
        	res = b;
        } 
      System.out.println(res);
    }
}
