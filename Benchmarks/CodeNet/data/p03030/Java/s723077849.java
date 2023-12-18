import java.util.*;


class Guidebook implements Comparable<Guidebook>{
    public int a;
    public String b;
    public int c;
    public  Guidebook(int a, String b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int compareTo(Guidebook all){
        int answer = b.compareTo(all.b);
        if(answer!=0){
            return answer;
        }
        return Integer.compare(all.c, c);
    }
}


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        String b[] = new String[a];
        int c[] = new int[a];
      
        for(int i = 0;i < a;i++){
          b[i] = sc.next();
          c[i] = sc.nextInt();
        }
      
        List <Guidebook> list = new ArrayList<Guidebook>();
        
        for(int i = 0;i < a;i++){
          list.add(new Guidebook(i+1,b[i],c[i]));
        }
        Collections.sort(list);
      for (Guidebook book: list) {
        System.out.println(book.a);
      }
    }
}
