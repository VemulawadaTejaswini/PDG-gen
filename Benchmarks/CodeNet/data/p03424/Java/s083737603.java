import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
      	ArrayList<String> array = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
      	int a = scanner.nextInt();
		while (true) {
			String s = scanner.next();
			if (String.valueOf(s).length() == 0) { // 文字列が空(長さゼロ)の場合
				break;
			}
			array.add(s);
        }
        int n = 0;
        boolean i = false;
        for(n = 0;n < a;n++){
         	if("Y" == array.get(n))i = true;
        }
        if(i){
            System.out.println("Four");
        }else{
          System.out.println("Three");
        }
    }
}