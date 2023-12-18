import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int h = sc.nextInt();
    final int w = sc.nextInt();
    final int a = sc.nextInt();
    final int b = sc.nextInt();
    sc.close();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<h;i++) {
    	for(int j=0;j<w;j++) {
    		if((i<b)^(j<a)) {
    			sb.append("1");
    		}else {
    			sb.append("0");
    		}
    	}
    	System.out.println(sb.toString());
    }
  }
}