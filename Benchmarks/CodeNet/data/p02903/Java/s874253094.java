import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      for(int i = 0;i < h-b;i++){
        StringBuilder sb = new StringBuilder();
      	for(int j = 0;j < w-a;j++)sb.append(1);
        for(int j = w-a;j < w;j++)sb.append(0);
        System.out.println(new String(sb));
      }
      for(int i = h-b;i < h;i++){
      	StringBuilder sb = new StringBuilder();
        for(int j = 0;j < w-a;j++)sb.append(0);
        for(int j = w-a;j < w;j++)sb.append(1);
        System.out.println(new String(sb));
      }
    }
}
