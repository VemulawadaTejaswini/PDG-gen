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
      
      Long output = new Long(0);
      
      int N = sc.nextInt();
      int H = sc.nextInt();
      ArrayList<Integer> aList = new ArrayList<Integer>(N);
      ArrayList<Integer> bList = new ArrayList<Integer>(N);
      for(int i = 0; i < N; i++){
        aList.add(sc.nextInt());
        bList.add(sc.nextInt());
      }
      //aの最大値以上となっているbをとりあえず全部投げておく(刀自体は残るものとする)
      //あとはaの最大値となる刀を振り回す（残HPを割る）
      Collections.sort(aList,Comparator.reverseOrder());
      Collections.sort(bList,Comparator.reverseOrder());
      int aMax = aList.get(0);
      for(int i = 0; i < N; i++){
        int tmpB = bList.get(i);
        if(tmpB >= aMax && H > 0){
          H = H - tmpB;
          output++;
        }else{
          break;
        }
      }
      
      if(H <= 0){
        H = 0;
      }
      int aAttack = H / aMax;
      if(H % aMax != 0){
        aAttack++;
      }
      output += aAttack;
      myout(output);
	}
}
