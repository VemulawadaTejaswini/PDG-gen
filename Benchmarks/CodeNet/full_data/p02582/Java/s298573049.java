import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       String a= in.next();
       int d = 0;
        char [] arr = a.toCharArray();
       for(int i=1; i<arr.length; i++){
           int j= i-1;
          if(arr[j]=='R' && arr[i]=='R'){
              d++;
              j++;
              i++;
          }
       }
        
        System.out.println(""+d);
    }
    
}