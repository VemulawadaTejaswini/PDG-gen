import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	Integer cnt = 0;
      	Integer tmp = 0;
		for(int i=0; i < str.length(); i++){
          char C = str.charAt(i);
          if(C=='A'||C=='C'||C=='G'||C=='T' ){
			tmp++;
            continue;
          }else{
          	if(tmp > cnt){
              cnt = tmp;
            }  
            tmp = 0;
          }
        }
		System.out.println(cnt);
      	return;
	}
}
