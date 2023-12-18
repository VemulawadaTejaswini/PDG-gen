import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int tmp = 0;
    int count = 0;
    boolean allzero = true;
    for(int i=0;i<N;i++){
      int nextNum = sc.nextInt();
      tmp = tmp^nextNum;
      count = (count+1)%3;
      if(nextNum!=0)allzero = false;
    }
    if((count==0&&tmp==0) || allzero){
        System.out.println("Yes");
    }else{
      System.out.println("No");
    }
	}
}
