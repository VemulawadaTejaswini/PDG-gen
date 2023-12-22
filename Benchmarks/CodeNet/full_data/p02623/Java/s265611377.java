import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextInt();
    ArrayList<Integer> aBooks = new ArrayList<Integer>();
    int aTotal = 0;
    for(int i = 0; i < n; i++){ //A desk
      aBooks.add(sc.nextInt());
      aTotal += aBooks.get(i);
    }
    ArrayList<Integer> bBooks = new ArrayList<Integer>();
    int bTotal = 0;
    for(int i = 0; i < m; i++){ //B desk
      bBooks.add(sc.nextInt());
      bTotal += bBooks.get(i);
    }

    //output
    if( k > (aTotal + bTotal) ){
      System.out.println(n+m);
      System.exit(0);
    }

    long total = 0;
    int bookTotal = 0;
    while( !( aBooks.size() == 0 && bBooks.size() == 0 ) ){

      if( aBooks.size() == 0 && bBooks.size() > 0 ){

        for(int i = 0; i < bBooks.size(); i++){
          if( total + bBooks.get(0) > k ){
            break;
          }
          total += bBooks.get(i);
          bookTotal++;
        }
        break;

      }else if( aBooks.size() > 0 && bBooks.size() == 0 ){

        for(int i = 0; i < aBooks.size(); i++){
          if( total + aBooks.get(i) > k ){
            break;
          }
          total += aBooks.get(i);
          bookTotal++;
        }
        break;

      }else if( aBooks.size() == 0 && bBooks.size() == 0 ){
        break;
      }else{
        if( aBooks.get(0) < bBooks.get(0) ){
          if( total + aBooks.get(0) > k ){
            break;
          }
          total += aBooks.get(0);
          aBooks.remove(0);
          bookTotal++;
        }else{
          if( total + bBooks.get(0) > k ){
            break;
          }
          total += bBooks.get(0);
          bBooks.remove(0);
          bookTotal++;
        }
      }

    }
    System.out.println(bookTotal);

  }
}
