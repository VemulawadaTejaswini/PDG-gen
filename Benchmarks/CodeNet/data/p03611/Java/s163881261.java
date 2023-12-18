import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int len = sc.nextInt();
      ArrayList<Integer> syutugen = new ArrayList<Integer>();
      Hashtable ht = new Hashtable();
      for(int i = 0; i < len; i++){
        int tmp = sc.nextInt();
        if(!syutugen.contains(tmp)){
          syutugen.add(tmp);
          ht.put(tmp,1);
        }else{
          int addTmp = (Integer)ht.get(tmp) + 1;
          ht.put(tmp,addTmp);
        }
        int mae = tmp - 1;
        if(!syutugen.contains(mae)){
          syutugen.add(mae);
          ht.put(mae,1);
        }else{
          int addMae = (Integer)ht.get(mae) + 1;
          ht.put(mae,addMae);
        }
        int ato = tmp + 1;
        if(!syutugen.contains(ato)){
          syutugen.add(ato);
          ht.put(ato,1);
        }else{
          int addAto = (Integer)ht.get(ato) + 1;
          ht.put(ato,addAto);
        }
      }
      int max = 0;
      for(int i = 0; i < syutugen.size(); i++){
        max = Math.max(max, (Integer)ht.get(syutugen.get(i)));
      }
      System.out.println(max);
	}
}
