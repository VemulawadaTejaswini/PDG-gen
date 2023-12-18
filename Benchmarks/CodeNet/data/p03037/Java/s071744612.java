import java.util.Scanner;



public class C{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int num=0;


    //int[] ans=new int[n+1];

    int l=scanner.nextInt();
    int r=scanner.nextInt();

    for(int i=1;i<m;i++){
      int ll=scanner.nextInt();
      int rr=scanner.nextInt();
      if(ll>l){
        l=ll;
      }
      if(rr<r){
        r=rr;
      }
    }

    num=r-l+1;
    if(num<0){
      num=0;
    }

    System.out.println(num);
    //System.out.printf("%.12f\n",ans);
  }
}
