import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<>();
    boolean flag = true;
    for(int i = 0; i < n; i++){
      	if(flag)
          list.add(sc.nextInt());
      	else
          list.add(0, sc.nextInt());
      	flag = !flag;
    }
  
    if(n % 2 == 0){  
      for(int i = 0; i < n; i++)
        System.out.printf("%d ", list.get(i)); 
    }else{
      for(int i = list.size()-1; i >= 0; i--)
        System.out.printf("%d ", list.get(i));
    }
  } 
}