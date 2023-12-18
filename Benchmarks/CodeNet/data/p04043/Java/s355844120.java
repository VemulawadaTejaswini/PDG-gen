import java.util.*;


public class Main(){
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      
      int[] array = {n1,n2,n3};
      int match1 = 0;
      int match2 = 0;
      for(int val : array){
        if(val == 5){
          match1++;
        }else if(val == 7){
          match2++;
        }
      }
      
      if(match1 == 2 && match2 == 1){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
}