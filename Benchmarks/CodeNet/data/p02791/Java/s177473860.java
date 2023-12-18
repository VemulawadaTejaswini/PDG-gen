import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 0;
    sc.nextLine();
    String line = sc.nextLine();
    String[] array = line.split(" ");
    int pi;
    int min = a + 1;
    for(int i = 0; i < a ; i++){
      pi = Integer.parseInt(array[i]);
      if(min > pi) {
    	  count++;
    	  min = pi;
      }
    }
    
    System.out.println(count);
  }
}
    
    