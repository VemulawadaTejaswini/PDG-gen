import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
      	int len = S.length();
      	int count = 0;
      	for(int i=0;i<=len-4;i++){
          for(int j=i+4;j<=len;j++){
            long target = Long.parseLong(S.substring(i,j));
            if(target % 2019 == 0) count++;
          }
        }
		System.out.println(count);
	}
}