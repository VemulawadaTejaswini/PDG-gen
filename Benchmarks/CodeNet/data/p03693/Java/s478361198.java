import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
      	int r = Integer.parseInt(line[0]) * 100;
       	int g = Integer.parseInt(line[1]) * 10;
      	int b = Integer.parseInt(line[2]);
    	
      	int result = r + g + b;
      	
      	if(result % 4 == 0){
        	System.out.println("YES");
          	return;
        }
        
      	System.out.println("NO");
    	
    }
}