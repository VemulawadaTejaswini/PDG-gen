import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] array = sc.next().split("");
    int start =0;
    int first_A=0;
    int end =0;
    for(int i=0; i<array.length; i++){
    	if(array[i].equals("A") && first_A==0){
        	start=i;
            first_A=1;
        }
        if(array[i].equals("Z") && first_A !=0 ){
        	end =i;
        }
    }
    System.out.println(end - start + 1);
  }
}