import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int num = 0;
        for(int i=1;i<=n;i++){
          if(i!=scan.nextInt())num++;
        }
      if(num==0 || num==2){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
	}
}