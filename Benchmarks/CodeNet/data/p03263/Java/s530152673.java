import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H,W;
    H = sc.nextInt();
    W = sc.nextInt();
    int a[][] = new int[H][W];
    for(int i=0; i<H; i++){
      for(int j=0; j<W; j++){
        a[i][j] = sc.nextInt();
      }
    }
    
    int count = 0;
    int s1,s2,s3,s4;
    List<String> list = new ArrayList<String>();
    for(int i=0; i<H; i++){
      for(int j=0; j<W; j++){
        if(i == H-1 && j == W-1) break;
        if(a[i][j] % 2 == 1){
          count++;
          if(j <= W-2){
            a[i][j]--;
            a[i][j+1]++;
            s1 = i+1;
            s2 = j+1;
            s3 = i+1;
            s4 = j+2;
            list.add(s1 + " " + s2 + " " + s3 + " " + s4);
          }else{
            a[i][j]--;
            a[i+1][j]++;
            s1 = i+1;
            s2 = j+1;
            s3 = i+2;
            s4 = j+1;
            list.add(s1 + " " + s2 + " " + s3 + " " + s4);
          }
        }
      }
    }
    System.out.println(count);
    list.forEach(System.out::println);
  }
}