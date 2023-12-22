import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		for(int i=1;i<6;i++){
          if(sc.nextInt()==0){
            System.out.println(i);
            break;
          }
        }
}
}