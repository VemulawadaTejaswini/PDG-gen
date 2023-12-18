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
      ArrayList<Integer> list = new ArrayList<Integer>();
      int[] checked = new int[len];
      Arrays.fill(checked,0);
      while(sc.hasNext()){
        int tmp = sc.nextInt();
        checked[tmp]++;
        if(list.indexOf(tmp) == -1){
          list.add(tmp);
        }
      }
      for(int i = len % 2 + 1; i < checked.length; i += 2){
        if((i == 0 && checked[i] != 1) || checked[i] != 2){
          myout("0");
          return;
        }
        output *= 2 % 1000000007;
      }
      
      myout(output);
	}
}
