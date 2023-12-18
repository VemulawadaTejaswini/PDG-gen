import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int length = sc.nextInt();
    int number = sc.nextInt();
    String[] strings = new String[number];
    for(int i = 0; i < number; i++)
      strings[i] = sc.next();
    
    for(int i = 0; i < strings.length; i++){
      for(int j = number - 1; j > i; j--){  //バブルソート
          if(strings[j-1].compareTo(strings[j]) > 0){
            String swap = strings[j-1];
            strings[j-1] = strings[j];
            strings[j] = swap;
        }      
      }
    }
    for(int i = 0; i < strings.length; i++){
      StringBuffer sb = new StringBuffer();
      sb.append(strings[i]);
    }
             System.out.println(sb);
    
  }
}