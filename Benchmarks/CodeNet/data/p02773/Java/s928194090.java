import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int  max = 0;
    List<String> stringList = new ArrayList<String>();
    List<Integer> numberList = new ArrayList<Integer>();
    
    for(int i=0; i<N; i++){
    	String s = sc.next();
      	if(stringList.contains(s) == true){
            int index = stringList.indexOf(s);
            int number = numberList.get(index);
            numberList.set(index,  number + 1);
            if(max < number + 1)
              max = number + 1;
        } else{
            stringList.add(s);
            numberList.add(1);
        } 
    }
    for(int i=0; i<stringList.size(); i++){
        if(numberList.get(i) == max)
          System.out.println(stringList.get(i));
    }
    
  }
}
