import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	sc.close();
    	int ans = 0;
    	for(int i = start; i <= end; i++){
    		int i_2 = i;
    		if(i / 1000 == i_2 % 100) ans++;
		}
    	System.out.println(ans);
    }

}
