import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	String a[] = sc.next().split("");
        for(int i = 0;i < a.length;i++){
          if(a[i].equals(",")){
            System.out.print(" ");
          }else{
            System.out.print(a[i]);
          }
        }
      	System.out.println("");
      
    }
}