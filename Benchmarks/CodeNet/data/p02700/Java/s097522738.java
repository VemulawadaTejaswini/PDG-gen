import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
 
//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int time = 0;
        while(a > 0 && c > 0){
        	if(time % 2 == 0){
        		c = c-b;
        	}else{
        		a = a-d;
        	}
        	time++;
        }
        System.out.println(a > 0 ? "Yes": "No");
    }
}