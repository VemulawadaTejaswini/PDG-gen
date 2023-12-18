import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nin = sc.nextInt();
        int day = sc.nextInt();
        int zan = sc.nextInt();
      	int count = 0;
      	int eat = 0;
      
      for(int i = 0;i < nin;i++){
        eat = sc.nextInt();
        if(eat>=day)count--;
        eat = day/eat+1;
        zan +=eat;
      }
		System.out.print(zan+count);		
    }
}