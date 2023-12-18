import java.util.*;
public class Main {
	public static void main(String[] args){
  int cnt=0;
  Scanner sc = new Scanner(System.in);
  int K= sc.nextInt();
  for(int i=1;i<=K;i=i+2){
	for(int j=K;j>0;j--){
		  System.out.println(i);
		if(i%2==1&&j%2==0){
			System.out.println(j);
			cnt++;
		}else if(i%2==0&&j%2==1){
			cnt++;
			System.out.println(j);
		}
		  System.out.println("");
	}
  }
  System.out.println(cnt);
	}
}
