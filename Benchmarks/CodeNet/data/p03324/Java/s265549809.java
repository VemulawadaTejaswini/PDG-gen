import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
        int nam = 1;
      
    	for (int i = 0; i < a; i++) {
            nam *= 100;
        }
  		System.out.print(nam*b);    	

    }
}