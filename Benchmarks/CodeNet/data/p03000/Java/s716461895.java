import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
      int cnt = 0;
      int a = 0;
      if(a<=x){
        cnt++;
      }
      for(int i=0; i<n; i++){
        int l = scan.nextInt();
        a = a+l;
        if(a<=x){
        cnt++;
      }
      }
          System.out.println(cnt);

	}
 
}