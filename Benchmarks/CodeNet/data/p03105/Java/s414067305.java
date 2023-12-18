import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	int Z = sc.nextInt();
    	sc.close();
    	int ans = 0;
    	if(X * Z <= Y) ans = Z;
    	else ans = Y / X;
    	System.out.println(ans);
    }
}