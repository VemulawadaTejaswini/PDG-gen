import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    scan.nextLine();
    String[][] S=new String[N][10];
    String[] s=new String[N];
    for(int i=0;i<N;i++){
      S[i]=scan.nextLine().split("");
      Arrays.sort(S[i]);
      s[i]="";
    }
    for(int i=0;i<N;i++){
      for(int j=0;j<10;j++){
        s[i]+=S[i][j];
      }
    }
    long count=0;
    for(int i=0;i<N;i++){
      for(int j=i+1;j<N;j++){
        if(s[i].equals(s[j])){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}