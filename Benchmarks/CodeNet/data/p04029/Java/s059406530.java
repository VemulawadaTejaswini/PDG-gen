import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n+1; i++){
            	count = count+i; 
            }
       System.out.println(count);

}
}