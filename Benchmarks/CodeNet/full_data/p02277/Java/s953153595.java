import java.io.*;
import java.util.*;

public class Main{
  //static[] A;
  public static int judge = 0;
  public static int count = 0;

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //int n = scan.nextInt();
    String l = scan.nextLine();
    int n = Integer.parseInt(l);
    Card[] cards = new Card[n];
    //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    for(int i=0 ; i<n ; i++){
      //String[] st = bf.readLine().split(" ");
      //StringTokenizer sss = new StringTokenizer(bf.readLine());
      //String[] st = sss.nextToken();
      //int a = Integer.parseInt(sss.nextToken());
      String line = scan.nextLine();
      cards[i] = new Card(line.substring(0, 1), Integer.parseInt(line.substring(2)), i);
      //cards[i] = new Card(st[0], a, i);
    }

    quicksort(cards, 0, n-1);

    for(int i=0 ; i<n-1 ; i++){
      if(cards[i].num == cards[i+1].num && cards[i].ord > cards[i+1].ord){
        judge++;
        break;
      }
    }

    if( judge>0 ){
      System.out.println("Not stable");
    }
    else{
      System.out.println("Stable");
    }

    for(int i=0 ; i<n ; i++){
      StringBuffer S = new StringBuffer();
      S.append(cards[i].str);
      S.append(" ");
      S.append(cards[i].num);
      System.out.println(S);
    }
  }

public static int partition(Card[] c, int p, int r){
    int x, i, j, t;
    x = c[r].num;
    i = p-1;
    Card S = new Card(null, 0, 0);
    for(j=p ; j<r ; j++){
      if(c[j].num <= x){
        i++;
        S = c[i];
        c[i] = c[j];
        c[j] = S;
      }
    }
    S = c[i+1];
    c[i+1] = c[r];
    c[r] = S;
    return i+1;
  }

public static void quicksort(Card[] c , int p, int r){
    if( p<r ){
      int q = partition(c, p, r);
      quicksort(c, p , q-1);
      quicksort(c, q+1 , r);
    }
  }
}

class Card{
  String str;
  int num;
  int ord;

  public Card(String str, int num, int ord){
    super();
    this.str = str;
    this.num = num;
    this.ord = ord;
  }
}

