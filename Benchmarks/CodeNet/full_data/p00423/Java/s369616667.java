import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        new aoj().doIt();
    }
    class aoj {
        void doIt(){
        	while(true){
        		int n = Integer.parseInt(sc.next());
        		if(n == 0)break;
        		int A = 0,B = 0;
        		for(int i = 0;i < n;i++){
        			int a = Integer.parseInt(sc.next());
        			int b = Integer.parseInt(sc.next());
        			if(a > b)A = A + a + b;
        			else if(a < b)B = B + b + a;
        			else{
        				A = A + a;
        				B = B + b;
        			}
        		}
        		System.out.println(A+" "+B);
        	}
        }
    }
}