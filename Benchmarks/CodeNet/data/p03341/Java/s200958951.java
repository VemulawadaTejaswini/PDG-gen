import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	String s[] = sc.next().split("");
        int ans = n * 2;
        int count = 0;
		for(int i = 0;i < n;i++){
          count = 0;
          for(int j = i + 1;j < n;j++){
            if(s[j].equals("E")){
              count++;
            }
          }
          for(int j = i - 1;j >= 0;j--){
            if(s[j].equals("W")){
              count++;
            }
          }
          if(count < ans){
           ans = count; 
          }
        }
        System.out.println(ans); 
    }
}