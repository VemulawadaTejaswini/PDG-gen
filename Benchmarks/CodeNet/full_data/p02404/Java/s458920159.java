import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int H[] = new int[9999];
    int W[] = new int[9999];
    int i=0;

    H[0]=1;
    W[0]=1;
    do{
      H[i] = scanner.nextInt();
      W[i] = scanner.nextInt();
      i++;
    }while((!(H[i-1]==0&&W[i-1]==0)));

    for (int j=0;j<i-1;j++){
      for(int k=0;k<H[j];k++){
        for(int l=0;l<W[j];l++){
          if(k==0||k==H[j]-1)System.out.print("#");
          else if(l==0||l==W[j]-1)System.out.print("#");
          else System.out.print(".");
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }

  }
}

