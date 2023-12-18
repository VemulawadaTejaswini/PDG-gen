import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      	int count = 0;
      	for(int i = 0 ; i < 3 ; i++){
         if(a.substring(i,1) == "1"){
  			count += 1;       
         }
        }          
            System.out.println(count);
    }
}

