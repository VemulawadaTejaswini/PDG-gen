import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
		// 整数の入力
		int number = sc.nextInt();
		for(int i = 0; i < number; i++){
      array.add(sc.nextInt());
    }

    int total = 0;
    for(int i = 0; i < array.size()-2; i++){
      for(int j = 1+i; j < array.size()-1; j++){
        
          for(int k = 1+j; k < array.size(); k++){
            int a = array.get(i);
            int b = array.get(j);
            int c = array.get(k);
            //System.out.printf("%d %d %d \n",a,b,c);
            if(a<b+c && b < a+c && c < a+b)
              total++;
          }

      }
    }

    System.out.println(total);
	}
}