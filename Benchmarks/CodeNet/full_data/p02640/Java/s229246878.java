import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
      //入力
      int X =sc.nextInt();//動物の総数
      int Y =sc.nextInt();//足の総数
      
      //鶴と亀がそれぞれ何匹いるか(鶴基準)
      //組み合わせできるか
      for(int i =0; i<=X; i++){
      	
        if(((2*i)+4*(X-i))==Y){
          
        	System.out.println("Yes");
         	 return;
        }
      }
        	System.out.println("No");
    }
}  
    