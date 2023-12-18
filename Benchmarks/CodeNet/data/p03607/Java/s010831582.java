import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int check;
        HashSet hs = new HashSet();
        for(int i = 0;i < n;i++){
          check = sc.nextInt();
          if(hs.contains(check)){
            hs.remove(check);
          }else{
            hs.add(check);
          }
        }
          System.out.println(hs.size());
    }
}