import java.util.*;
public class Main {
  public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
    int input_num = sc.nextInt();
    int combi = 0;
    for(int c = 1; c < input_num; c++){
    	int ab = input_num - c;
      	for(int div = 1; div <= ab; div++){
          if(ab%div == 0) combi += 1;
        }
    }
    System.out.println(combi);
  }
}
