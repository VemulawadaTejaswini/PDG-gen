import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int len = sc.nextInt();
      Long output = new Long(1);
      int[] checked = new int[len];
      Arrays.fill(checked,0);
      while(sc.hasNext()){
        int tmp = sc.nextInt();
        checked[tmp]++;
      }
      for(int i = (len - 1) % 2; i <= len - 1; i += 2){
        if(i == 0 && checked[i] != 1){
          myout("0");
          return;
        }else if(i != 0 && checked[i] != 2){
          myout("0");
          return;
        }else{
       		output = (output * checked[i]) % 1000000007;
        }
      }
      
      myout(output);
	}
}
