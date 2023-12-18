import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int n = sc.nextInt();
    	int sum = 0;
    	for(int i = 0; i < n; i++){
    		sum += sc.nextInt();
    	}
    	sc.close();
    	if(0 >= h - sum){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
    }
}