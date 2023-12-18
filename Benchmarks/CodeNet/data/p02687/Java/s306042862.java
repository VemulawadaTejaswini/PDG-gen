import java.util.Scanner;
 
public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int f;
     
        cons(str);
        scan.close();
    }
}

public static boid cons(string title){
  int flag;
  if(title.equals(ARC)){
    System.out.println("先週開催されたコンテストは ARC なので、今週は ABC が開催されます。");
    return; 
  }else if(title.equals(ABC)){
    System.out.println("先週開催されたコンテストは ABC なので、今週は ARC が開催されます。");
    return;  
  } else {
    System.out.println("コンテスト名が正しくありません。");
    return;
  }
  return flag;
}