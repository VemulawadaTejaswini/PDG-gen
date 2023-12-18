import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	String str = sc.nextString();
      	Integer cnt = 0;
      	Integer flag = 0;
		for(int i=0; i < N; i++){
          if((flag==0)&&(str.charAt(i)=="A")){
          	flag = 1;
            continue;
          }
          if((flag==1)&&(str.charAt(i)=="B")){
          	flag = 2;
            continue;
          }
          if((flag==2)&&(str.charAt(i)=="C")){
            cnt++;
          	flag = 0;
            continue;
          }
          flag = 0;
        }
		System.out.println(cnt);
      	return;
	}
}
