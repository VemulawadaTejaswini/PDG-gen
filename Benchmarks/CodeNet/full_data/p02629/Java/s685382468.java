import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int cnt = 1;
      	int tmp = 1;
      	while(true){
          if( n < Math.pow(26,cnt) + tmp ){
            break;
          }else{
            tmp += Math.pow(26,cnt);
            cnt++;
          }
        }
      	char [] s = new char [cnt];
      	for(int i=0;i<cnt;i++){
          
          s[i] = (char)('a'+ n / Math.pow(26,cnt-i-1) -1);
          n = n % (int)Math.pow(26,cnt-i-1);
          System.out.print(s[i]);
          
          //System.out.println( Math.pow(26,cnt-i-1) );
        }
	}
}