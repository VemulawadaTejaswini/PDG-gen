import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

 	int d = Integer.parseInt(str1);
    int n = Integer.parseInt(str2);
    
	//100をdで割り切れる場合のn番目に小さい数字
    int result = 0, count = 0;
    for(int i = 1 ; i < 10000 ; i++){
      	if(i%100*d==0)
		  count++;
        if(count == n){
          result = i;
          break;
        }
    }
    System.out.println(result);
    }
}