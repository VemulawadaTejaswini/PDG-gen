import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num[] = new int [100];
    int list[] = new int [100];

    int n;
    int i=1;
    int j=0;
    int k, l;

    n = sc.nextInt();

    k=n;

    while(i<=n){
      num[i]=sc.nextInt();
      i++;
    }


    while(j<n){
      list[j]=num[k];
      j++;
      k--;
    }

    for(l=0; l<n; l++){
      System.out.printf("%d", list[l]);
    }
    System.out.printf("\n");
  }
}

