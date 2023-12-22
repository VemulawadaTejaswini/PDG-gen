import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
		ArrayList<String> item = new ArrayList<String>();
		item.add(sc.next());
        
      	for(int i=0; i<num-1; i++){
          String getItem = sc.next();
          boolean flg = false;
          for(int j=0; j<item.size(); j++){
            if (getItem.equals(item.get(j))){
              flg = true;
            }
          }
          if(!flg){
            item.add(getItem);
          }
        }
      
      	System.out.println(item.size());
          
    }

}