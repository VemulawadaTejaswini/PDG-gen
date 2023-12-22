import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	int max = 0;
      	int count = 0;
      	for(int i=0;i<s.length();i++){
          if( s.charAt(i) == 'S' ){
            count++;
          }else{
            count = 0;
          }
          if( max < count ){
            max = count;
          }
        }
      System.out.println(max);
	}
}