import java.util.*
class main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int k=scan.nextInt();
    if(n>=2*k-1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
