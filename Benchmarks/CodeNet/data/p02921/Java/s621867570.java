import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        String[] exTenki = {sc.next(), sc.next(), sc.next()};
        String[] plTenki = {sc.next(), sc.next(), sc.next()};
		
        int count = 0;
        for(int i = 0; i < 3; i++){
          if(exTenki[i].equals(plTenki[i])){
            count++;
          }
        }
      
		// 出力
		System.out.println(count);
	}
}