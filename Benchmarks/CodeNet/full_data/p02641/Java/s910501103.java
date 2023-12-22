import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int xx = x;
    boolean[] p = new boolean[100];
    Arrays.fill(p,false);
    for(int i = 0;i < scan.nextInt();i++){
      p[scan.nextInt()] = true;
    }
    boolean flag = false;
    int ans = x;
    while(!flag){
      if(!p[x]){flag=true;ans=x++;}
      if(!p[xx]){flag=true;ans=xx--;}
    }
  }
}